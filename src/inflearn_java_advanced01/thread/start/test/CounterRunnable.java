package inflearn_java_advanced01.thread.start.test;

import static inflearn_java_advanced01.util.MyLogger.log;

public class CounterRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                log("value: " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
