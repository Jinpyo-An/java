package inflearn_java_advaned.thread.start.test;

public class StartTest1Main {

    public static void main(String[] args) {
        final CounterThread thread = new CounterThread();
        thread.start();
    }
}
