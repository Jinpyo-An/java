package inflearn_java_advanced03.lambda.ex1;

import inflearn_java_advanced03.lambda.MyFunction;

public class M5Return {

    static MyFunction getOperation(String operator) {
        switch (operator) {
            case "add":
                return (a, b) -> a + b;
            case "sub":
                return (a, b) -> a - b;
            default:
                return (a, b) -> 0;
        }
    }

    public static void main(String[] args) {
        final MyFunction add = getOperation("add");
        final MyFunction sub = getOperation("sub");
        final MyFunction xxx = getOperation("xxx");
        System.out.println("add(1, 2) = " + add.apply(1, 2));
        System.out.println("sub(1, 2) = " + sub.apply(1, 2));
        System.out.println("xxx(1, 2) = " + xxx.apply(1, 2));
    }
}
