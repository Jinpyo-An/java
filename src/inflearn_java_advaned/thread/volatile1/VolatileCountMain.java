package inflearn_java_advaned.thread.volatile1;

import static inflearn_java_advaned.util.MyLogger.log;
import static inflearn_java_advaned.util.ThreadUtils.sleep;

public class VolatileCountMain {

    public static void main(String[] args) {
        MyTask task = new MyTask();
        final Thread t = new Thread(task, "work");
        t.start();

        sleep(1000);

        task.flag = false;
        log("flag = " + task.flag + ", count = " + task.count + " in main()");
    }

    static class MyTask implements Runnable {

        // boolean flag = true;
        // long count;

         volatile boolean flag = true;
         volatile long count;

        @Override
        public void run() {
            while (flag) {
                count++;
                if (count % 100_000_000 == 0) {
                    log("flag = " + flag + ", count = " + count + " in while()");
                }
            }
            log("flag = " + flag + ", count = " + count + " 종료");
        }
    }
}
