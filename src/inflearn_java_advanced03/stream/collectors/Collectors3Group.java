package inflearn_java_advanced03.stream.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Collectors3Group {

    public static void main(String[] args) {
        final List<String> names = List.of("Apple", "Avocado", "Banana", "Blueberry", "Cherry");
        final Map<String, List<String>> grouped = names.stream()
                .collect(Collectors.groupingBy(name -> name.substring(0, 1)));
        System.out.println("grouped = " + grouped);

        final List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        final Map<Boolean, List<Integer>> partitioned = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("partitioned = " + partitioned);
    }
}
