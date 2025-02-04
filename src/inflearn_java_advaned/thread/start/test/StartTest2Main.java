package inflearn_java_advaned.thread.start.test;

import static inflearn_java_advaned.util.MyLogger.log;

public class StartTest2Main {

    public static void main(String[] args) {

        final Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <=5 ; i++) {
                    log("value: " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }, "counter");
        thread.start();
    }
}
