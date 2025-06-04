package inflearn_java_advanced01.thread.start.test;

public class StartTest1Main {

    public static void main(String[] args) {
        final CounterThread thread = new CounterThread();
        thread.start();
    }
}
