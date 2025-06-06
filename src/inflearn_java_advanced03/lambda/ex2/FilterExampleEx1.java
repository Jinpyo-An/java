package inflearn_java_advanced03.lambda.ex2;

import java.util.ArrayList;
import java.util.List;

public class FilterExampleEx1 {

    public static List<Integer> filter(List<Integer> list, MyPredicate predicate) {
        List<Integer> result = new ArrayList<>();
        for (int val : list) {
            if (predicate.test(val)) {
                result.add(val);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(-3, -2, -1, 1, 2, 3, 5);
        System.out.println("원본 리스트: " + numbers);

        MyPredicate filterNegative = a -> a < 0;
        MyPredicate filterEven = a -> a % 2 == 0;

        final List<Integer> NegativeList = filter(numbers, filterNegative);
        final List<Integer> EvenList = filter(numbers, filterEven);
        System.out.println("음수만: " + NegativeList);
        System.out.println("홀수만: " + EvenList);
    }
}
