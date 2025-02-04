package inflearn_java_advaned.thread.start;

import static inflearn_java_advaned.util.MyLogger.log;

public class InnerRunnableMainV4 {

    public static void main(String[] args) {
        log("main() start");

        final Thread thread = new Thread(() -> log("run()"));
        thread.start();

        log("main() end");
    }
}
