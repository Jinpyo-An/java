package inflearn_java_advanced03.lambda.lambda1;

import inflearn_java_advanced03.lambda.Procedure;

public class LambdaSimple2 {

    public static void main(String[] args) {
        Procedure procedure1 = () -> {
            System.out.println("hello! lambda");
        };
        procedure1.run();

        Procedure procedure2 = () -> System.out.println("hello! lambda");
        procedure2.run();
    }
}
