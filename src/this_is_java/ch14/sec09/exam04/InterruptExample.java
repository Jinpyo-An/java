package this_is_java.ch14.sec09.exam04;

public class InterruptExample {
    public static void main(String[] args) {
        Thread thread = new PrintThread();
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}

        thread.interrupt();
    }
}
