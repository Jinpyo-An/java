package inflearn_java_advanced03.stream.operation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamMain {

    public static void main(String[] args) {
        final List<String> list = List.of("a", "b", "c");
        final Stream<String> stream1 = list.stream();
        stream1.forEach(System.out::println);

        final String[] arr = {"a", "b", "c"};
        final Stream<String> stream2 = Arrays.stream(arr);
        stream2.forEach(System.out::println);

        final Stream<String> stream3 = Stream.of("a", "b", "c");
        stream3.forEach(System.out::println);

        final Stream<Integer> infiniteStream = Stream.iterate(0, n -> n + 2);
        infiniteStream.limit(3).forEach(System.out::println);

        final Stream<Double> randomStream = Stream.generate(Math::random);
        randomStream.limit(3).forEach(System.out::println);
    }
}
