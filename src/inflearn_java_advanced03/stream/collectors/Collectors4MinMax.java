package inflearn_java_advanced03.stream.collectors;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Collectors4MinMax {

    public static void main(String[] args) {
        final Integer max1 = Stream.of(1, 2, 3)
                .collect(Collectors.maxBy(
                        (i1, i2) -> i1.compareTo(i2)
                )).get();
        System.out.println("max1 = " + max1);

        final Integer max2 = Stream.of(1, 2, 3)
                .max((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println("max2 = " + max2);

        final Integer max3 = Stream.of(1, 2, 3)
                .max(Integer::compareTo).get();
        System.out.println("max2 = " + max3);

        final int max4 = IntStream.of(1, 2, 3)
                .max().getAsInt();
        System.out.println("max4 = " + max4);
    }
}
