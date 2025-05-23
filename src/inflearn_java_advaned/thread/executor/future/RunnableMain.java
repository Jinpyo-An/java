package inflearn_java_advaned.thread.executor.future;

import java.util.Random;

import static inflearn_java_advaned.util.MyLogger.log;
import static inflearn_java_advaned.util.ThreadUtils.sleep;

public class RunnableMain {

    public static void main(String[] args) throws InterruptedException {
        final MyRunnable task = new MyRunnable();
        final Thread thread = new Thread(task, "Thread-1");
        thread.start();
        thread.join();
        final int result = task.value;
        log("result value = " + result);
    }

    static class MyRunnable implements Runnable {

        int value;

        @Override
        public void run() {
            log("Runnable 시작");
            sleep(2000);
            value = new Random().nextInt(10);
            log("create value = " + value);
            log("Runnable 완료");
        }
    }
}
