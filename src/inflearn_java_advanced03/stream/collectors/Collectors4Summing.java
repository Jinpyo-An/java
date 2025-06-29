package inflearn_java_advanced03.stream.collectors;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Collectors4Summing {

    public static void main(String[] args) {
        final Long count1 = Stream.of(1, 2, 3)
                .collect(Collectors.counting());

        final long count2 = Stream.of(1, 2, 3)
                .count();

        final Double average1 = Stream.of(1, 2, 3)
                .collect(Collectors.averagingInt(i -> i));

        final double average2 = Stream.of(1, 2, 3)
                .mapToInt(i -> i)
                .average().getAsDouble();

        final double average3 = IntStream.of(1, 2, 3)
                .average().getAsDouble();

        final IntSummaryStatistics stats = Stream.of("Apple", "Banana", "Tomato")
                .collect(Collectors.summarizingInt(String::length));

        System.out.println(stats.getCount());
        System.out.println(stats.getSum());
        System.out.println(stats.getMin());
        System.out.println(stats.getMax());
        System.out.println(stats.getAverage());
    }
}
