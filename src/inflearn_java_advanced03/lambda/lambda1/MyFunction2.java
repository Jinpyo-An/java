package inflearn_java_advanced03.lambda.lambda1;

import inflearn_java_advanced03.lambda.MyFunction;

public class MyFunction2 {

    public static void main(String[] args) {
        MyFunction myFunction = (int a, int b) -> {
                return a + b;
        };

        final int result = myFunction.apply(1, 2);
        System.out.println("result = " + result);
    }
}
