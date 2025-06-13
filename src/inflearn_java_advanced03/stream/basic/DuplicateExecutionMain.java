package inflearn_java_advanced03.stream.basic;

import java.util.List;
import java.util.stream.Stream;

public class DuplicateExecutionMain {

    public static void main(String[] args) {
        final Stream<Integer> stream = Stream.of(1, 2, 3);
        stream.forEach(System.out::println);

//        stream.forEach(System.out::println);
        final List<Integer> list = List.of(1, 2, 3);
        Stream.of(list).forEach(System.out::println);
        Stream.of(list).forEach(System.out::println);
    }
}
