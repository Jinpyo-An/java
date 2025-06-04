package inflearn_java_advanced03.lambda.lambda1;

import inflearn_java_advanced03.lambda.Procedure;

public class ProcedureMain2 {

    public static void main(String[] args) {
        Procedure procedure = () -> {
            System.out.println("hello! lambda");
        };

        procedure.run();
    }
}
