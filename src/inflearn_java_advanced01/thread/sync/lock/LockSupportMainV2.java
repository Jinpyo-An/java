package inflearn_java_advanced01.thread.sync.lock;

import java.util.concurrent.locks.LockSupport;

import static inflearn_java_advanced01.util.MyLogger.log;
import static inflearn_java_advanced01.util.ThreadUtils.sleep;

public class LockSupportMainV2 {

    public static void main(String[] args) {
        final Thread thread1 = new Thread(new PartTest(), "Thread-1");
        thread1.start();

        sleep(100);
        log("Thread-1 state: " + thread1.getState());
    }

    static class PartTest implements Runnable {
        @Override
        public void run() {
            log("part 시작");
            LockSupport.parkNanos(2000_000000);
            log("park 종료, state: " + Thread.currentThread().getState());
            log("인터럽트 상태: " + Thread.currentThread().isInterrupted());
        }
    }
}


