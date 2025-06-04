package inflearn_java_advanced03.lambda.start;

import inflearn_java_advanced03.lambda.Procedure;

import java.util.Random;

public class RandomProcess implements Procedure {

    @Override
    public void run() {
        int randomValue = new Random().nextInt(6) + 1;
        System.out.println("주사위 = " + randomValue);
    }
}
