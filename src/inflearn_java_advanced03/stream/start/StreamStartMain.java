package inflearn_java_advanced03.stream.start;

import java.util.List;
import java.util.stream.Stream;

public class StreamStartMain {

    public static void main(String[] args) {
        final List<String> names = List.of("Apple", "Banana", "Berry", "Tomato");

        final Stream<String> stream = names.stream();
        final List<String> result = stream.filter(name -> name.startsWith("B"))
                .map(String::toUpperCase)
                .toList();
        System.out.println("result = " + result);

        System.out.println("========외부 반복========");
        for (String s : result) {
            System.out.println(s);
        }

        System.out.println("========내부 반복========");
        names.stream().filter(name -> name.startsWith("B"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
