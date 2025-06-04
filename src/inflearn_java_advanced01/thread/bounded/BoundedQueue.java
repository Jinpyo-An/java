package inflearn_java_advanced01.thread.bounded;

public interface BoundedQueue {

    void put(String data);

    String take();
}
