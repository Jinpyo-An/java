package inflearn_java_advanced03.lambda.lambda3;

public class GenericMain5 {

    public static void main(String[] args) {
        GenericFunction<String, String> upperCase = s -> s.toUpperCase();
        final String result1 = upperCase.apply("hello");
        System.out.println("result1 = " + result1);

        GenericFunction<Integer, Integer> square = n -> n * n;
        final Integer result2 = square.apply(3);
        System.out.println("result2 = " + result2);
    }

    @FunctionalInterface
    interface GenericFunction<T, R> {
        R apply(T s);
    }
}
