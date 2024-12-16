package this_is_java.ch13.sec01.exam03;

public class Box<T> {
    public T content;

    public boolean compare(Box<T> other) {
        return content.equals(other.content);
    }
}
