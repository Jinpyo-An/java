package inflearn_java_advanced03.lambda.lambda.mystream;

import java.util.List;

public class MyStreamV2Main {

    public static void main(String[] args) {
        final List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        final List<Integer> result = MyStreamV2.of(numbers)
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .toList();
        System.out.println("result = " + result);
    }


}
