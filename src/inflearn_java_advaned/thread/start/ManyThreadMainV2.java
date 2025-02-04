package inflearn_java_advaned.thread.start;

import static inflearn_java_advaned.util.MyLogger.log;

public class ManyThreadMainV2 {

    public static void main(String[] args) {
        log("main() start");

        final HelloRunnable runnable = new HelloRunnable();

        for (int i = 0; i < 100; i++) {
            final Thread thread = new Thread(runnable);
            thread.start();
        }


        log("main() end");
    }
}
