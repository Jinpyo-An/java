package inflearn_java_advanced03.lambda.lambda4;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiMain {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println("add.apply(5,10) = " + add.apply(5, 10));

        BiConsumer<String, Integer> repeat = (c, n) -> System.out.println(c.repeat(n));
        repeat.accept("hello", 5);

        BiPredicate<Integer, Integer> isGreater = (a, b) -> a > b;
        System.out.println("isGreater.test(10 ,5) = " + isGreater.test(10, 5));
    }
}
