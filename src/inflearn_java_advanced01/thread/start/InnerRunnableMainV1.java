package inflearn_java_advanced01.thread.start;

import static inflearn_java_advanced01.util.MyLogger.log;

public class InnerRunnableMainV1 {

    public static void main(String[] args) {
        log("main() start");

        final MyRunnable runnable = new MyRunnable();
        final Thread thread = new Thread(runnable);
        thread.start();

        log("main() end");
    }

    static class MyRunnable implements Runnable {

        @Override
        public void run() {
            log("run()");
        }
    }
}
