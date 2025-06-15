package inflearn_java_advanced03.stream.operation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOperationMain {

    public static void main(String[] args) {
        final List<Integer> numbers = List.of(1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10);

        final List<Integer> evenNumber1 = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("evenNumber1 = " + evenNumber1);
        System.out.println();

        final List<Integer> evenNumber2 = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println("evenNumber1 = " + evenNumber1);
        System.out.println();

        final Integer[] arr = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toArray(Integer[]::new);
        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println();

        numbers.stream()
                .limit(5)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        final long count = numbers.stream()
                .filter(n -> n > 5)
                .count();
        System.out.println("5보다 큰 숫자 개수: "+ count);
        System.out.println();

        final Optional<Integer> sum1 = numbers.stream()
                .reduce((a, b) -> a + b);
        System.out.println("합계(초기값 없음): "+ sum1.get());

        final Integer sum = numbers.stream()
                .reduce(100, (a, b) -> a + b);

        final Optional<Integer> min = numbers.stream()
                .min(Integer::compareTo);
        System.out.println("최솟값: "+ min.get());

        final Optional<Integer> max = numbers.stream()
                .max(Integer::compareTo);
        System.out.println("최댓값: "+ max.get());

        final Integer first = numbers.stream()
                .filter(n -> n > 5)
                .findFirst().get();
        System.out.println(first);
        System.out.println();

        final Integer any = numbers.stream()
                .filter(n -> n > 5)
                .findAny().get();
        System.out.println(any);
        System.out.println();

        final boolean hasEven = numbers.stream()
                .anyMatch(n -> n % 2 == 0);
        System.out.println("hasEven = " + hasEven);
        System.out.println();

        final boolean allPositive = numbers.stream()
                .allMatch(n -> n > 0);
        System.out.println(allPositive);
        System.out.println();

        final boolean noNegative = numbers.stream()
                .noneMatch(n -> n < 0);
        System.out.println("noNegative = " + noNegative);
        System.out.println();
    }
}
