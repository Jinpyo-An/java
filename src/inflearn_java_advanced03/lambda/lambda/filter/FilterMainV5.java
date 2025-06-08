package inflearn_java_advanced03.lambda.lambda.filter;

import java.util.List;

import static inflearn_java_advanced03.lambda.lambda.filter.GenericFilter.*;

public class FilterMainV5 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        final List<Integer> numberResult = filter(numbers, n -> n % 2 == 0);
        System.out.println("evenNumbers = " + numberResult);

        List<String> strings = List.of("A", "BB", "CCC");
        final List<String> stringResult = filter(strings, s -> s.length() >= 2);
        System.out.println("stringResult = " + stringResult);
    }
}
