package inflearn_java_advaned.thread.sync.lock;

import java.util.concurrent.locks.LockSupport;

import static inflearn_java_advaned.util.MyLogger.log;
import static inflearn_java_advaned.util.ThreadUtils.sleep;

public class LockSupportMainV1 {

    public static void main(String[] args) {
        final Thread thread1 = new Thread(new PartTest(), "Thread-1");
        thread1.start();

        sleep(100);
        log("Thread-1 state: " + thread1.getState());

        log("main -> unpark(Thread-1)");
        LockSupport.unpark(thread1);
        thread1.interrupt();
    }

    static class PartTest implements Runnable {
        @Override
        public void run() {
            log("part 시작");
            LockSupport.park();
            log("park 종료, state: " + Thread.currentThread().getState());
            log("인터럽트 상태: " + Thread.currentThread().isInterrupted());
        }
    }
}


