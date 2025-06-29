package inflearn_java_advanced03.stream.collectors;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collectors1Basic {

    public static void main(String[] args) {
        final List<String> list = Stream.of("Java", "Spring", "JPA")
                .collect(Collectors.toList());


        final List<Integer> unmodifiableList = Stream.of(1, 2, 3)
                .collect(Collectors.toUnmodifiableList());

        final Set<Integer> set = Stream.of(1, 2, 2, 3, 3, 3)
                .collect(Collectors.toSet());

        final TreeSet<Integer> treeSet = Stream.of(3, 4, 5, 2, 1)
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println("treeSet = " + treeSet);
    }
}
