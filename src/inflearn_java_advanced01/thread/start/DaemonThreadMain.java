package inflearn_java_advanced01.thread.start;

public class DaemonThreadMain {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main() start");
        final DaemonThread daemonThread = new DaemonThread();
        daemonThread.setDaemon(false);
        daemonThread.start();

        System.out.println(Thread.currentThread().getName() + ": main() end");
    }

    static class DaemonThread extends Thread {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ": run() start");

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(Thread.currentThread().getName() + ": run() end");
        }
    }
}
