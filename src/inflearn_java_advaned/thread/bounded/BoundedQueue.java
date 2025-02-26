package inflearn_java_advaned.thread.bounded;

public interface BoundedQueue {

    void put(String data);

    String take();
}
