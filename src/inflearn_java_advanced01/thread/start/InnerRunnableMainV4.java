package inflearn_java_advanced01.thread.start;

import static inflearn_java_advanced01.util.MyLogger.log;

public class InnerRunnableMainV4 {

    public static void main(String[] args) {
        log("main() start");

        final Thread thread = new Thread(() -> log("run()"));
        thread.start();

        log("main() end");
    }
}
