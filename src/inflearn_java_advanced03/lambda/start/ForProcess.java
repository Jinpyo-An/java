package inflearn_java_advanced03.lambda.start;

import inflearn_java_advanced03.lambda.Procedure;

public class ForProcess implements Procedure {

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("i = " + i);
        }
    }
}
