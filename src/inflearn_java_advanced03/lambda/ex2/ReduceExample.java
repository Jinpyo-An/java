package inflearn_java_advanced03.lambda.ex2;

import java.util.List;

public class ReduceExample {

    public static int reduce(List<Integer> list, int initial, MyReducer reducer) {
        int result = initial;

        for (Integer val : list) {
            result = reducer.reduce(result, val);
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4);
        System.out.println("리스트: " + numbers);

        final int sum = reduce(numbers, 0, (a, b) -> a + b);
        System.out.println("합(누적 +): " + sum);

        final int multiple = reduce(numbers, 1, (a, b) -> a * b);
        System.out.println("곱(누적 *): " + multiple);
    }
}
