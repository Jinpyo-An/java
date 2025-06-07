package inflearn_java_advanced03.lambda.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterExample3 {

    public static List<Integer> filter(List<Integer> list, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();
        for (Integer val : list) {
            if (predicate.test(val)) {
                result.add(val);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(-3, -2, -1, 1, 2, 3, 5);
        System.out.println("원본 리스트: " + numbers);

        final List<Integer> negatives = filter(numbers, value -> value < 0);
        System.out.println("음수만: "+ negatives);

        final List<Integer> evens = filter(numbers, value -> value % 2 == 0);
        System.out.println("짝수만: "+ evens);

    }
}
