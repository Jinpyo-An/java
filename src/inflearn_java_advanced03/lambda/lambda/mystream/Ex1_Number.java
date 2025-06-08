package inflearn_java_advanced03.lambda.lambda.mystream;

import java.util.ArrayList;
import java.util.List;

import static inflearn_java_advanced03.lambda.lambda.filter.GenericFilter.filter;
import static inflearn_java_advanced03.lambda.lambda.map.GenericMapper.map;

public class Ex1_Number {

    public static void main(String[] args) {
        final List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        final List<Integer> directResult = direct(numbers);
        System.out.println("directResult = " + directResult);

        final List<Integer> lambdaResult = lambda(numbers);
        System.out.println("lambdaResult = " + lambdaResult);
    }

    private static List<Integer> lambda(List<Integer> numbers) {
        final List<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                result.add(number * 2);
            }
        }
        return result;
    }

    private static List<Integer> direct(List<Integer> numbers) {
        final List<Integer> filteredList = filter(numbers, n -> n % 2 == 0);
        final List<Integer> mappedList = map(filteredList, n -> n * 2);
        return mappedList;
    }
}
