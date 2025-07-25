package inflearn_java_advanced03.methodref.start;

import java.util.function.BinaryOperator;

public class MethodRefStartV1 {

    public static void main(String[] args) {
        BinaryOperator<Integer> add1 = (x, y) -> x + y;
        BinaryOperator<Integer> add2 = (x, y) -> x + y;

        final Integer result1 = add1.apply(1, 2);
        System.out.println("result1 = " + result1);

        final Integer result2 = add2.apply(1, 2);
        System.out.println("result2 = " + result2);
    }
}
