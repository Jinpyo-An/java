package inflearn_java_advanced03.lambda.ex2;

public class BuildGreeterExample {

    public static StringFunction buildGreeter(String greeting) {
        return str -> greeting + ", " + str;
    }

    public static void main(String[] args) {
        final StringFunction function1 = buildGreeter("Hello");
        final StringFunction function2 = buildGreeter("Hi");
        System.out.println(function1.apply("Java"));
        System.out.println(function2.apply("Lambda"));
    }
}
