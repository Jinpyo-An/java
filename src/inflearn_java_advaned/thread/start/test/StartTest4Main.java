package inflearn_java_advaned.thread.start.test;

import static inflearn_java_advaned.util.MyLogger.log;

public class StartTest4Main {

    public static void main(String[] args) {
        final Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {

                while (true) {
                    log("value: " + "A");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }, "Thread-A");

        final Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    log("value: " + "B");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }, "Thread-B");

        threadA.start();
        threadB.start();
    }
}