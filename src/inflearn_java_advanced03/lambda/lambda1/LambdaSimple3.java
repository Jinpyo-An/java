package inflearn_java_advanced03.lambda.lambda1;

import inflearn_java_advanced03.lambda.MyFunction;

public class LambdaSimple3 {

    public static void main(String[] args) {
        MyFunction myFunction1 = (int a, int b) -> a + b;

        MyFunction myFunction2 = (a, b) -> a + b;

        final int result = myFunction2.apply(1, 2);
        System.out.println("result = " + result);
    }
}
