package inflearn_java_advanced03.stream.operation;

import java.util.IntSummaryStatistics;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class PrimitiveStreamMain {

    public static void main(String[] args) {
        final IntStream stream = IntStream.of(1, 2, 3, 4, 5);
        stream.forEach(i -> System.out.print(i + " "));
        System.out.println();

        final IntStream range1 = IntStream.range(1, 6);
        final IntStream range2 = IntStream.rangeClosed(1, 5);

        final int sum = IntStream.range(1, 6).sum();
        System.out.println("sum = " + sum);
        System.out.println();

        final double avg = IntStream.range(1, 6)
                .average()
                .getAsDouble();
        System.out.println("avg = " + avg);
        System.out.println();

        final IntSummaryStatistics stats = IntStream.range(1, 6).summaryStatistics();
        System.out.println(stats.getSum());
        System.out.println(stats.getAverage());
        System.out.println(stats.getMax());
        System.out.println(stats.getMin());
        System.out.println(stats.getCount());
        System.out.println();

        final LongStream longStream = IntStream.range(1, 6).asLongStream();
        final DoubleStream doubleStream = IntStream.range(1, 6).asDoubleStream();

        final Stream<Integer> boxedStream = IntStream.range(1, 6).boxed();

        final LongStream mappedLong = IntStream.range(1, 6)
                .mapToLong(i -> i * 10L);

        final DoubleStream mappedDouble = IntStream.range(1, 5)
                .mapToDouble(i -> i * 1.5);

        final Stream<String> mappedObj = IntStream.range(1, 6)
                .mapToObj(i -> "Number: " + i);

        final Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        final IntStream intStream = integerStream.mapToInt(i -> i);

        final int sum1 = Stream.of(1, 2, 3, 4, 5)
                .mapToInt(i -> i)
                .sum();
        System.out.println("sum1 = " + sum1);
        System.out.println();
    }
}
