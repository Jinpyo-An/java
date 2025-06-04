package inflearn_java_advanced01.thread.start.test;

import static inflearn_java_advanced01.util.MyLogger.log;

public class CounterThread extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <=5 ; i++) {
            try {
                Thread.sleep(1000);
                log("value: " + i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
