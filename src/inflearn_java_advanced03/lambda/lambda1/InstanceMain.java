package inflearn_java_advanced03.lambda.lambda1;

import inflearn_java_advanced03.lambda.Procedure;

public class InstanceMain {

    public static void main(String[] args) {
        Procedure procedure1 = new Procedure() {
            @Override
            public void run() {
                System.out.println("hello! lambda");
            }
        };
        System.out.println("class.class = "+ procedure1.getClass());
        System.out.println("class.instance = "+ procedure1);

        Procedure procedure2 = () -> {
            System.out.println("hello! lambda");
        };
        System.out.println("lambda.class = " + procedure2.getClass());
        System.out.println("lambda.instance = " + procedure2);
    }
}