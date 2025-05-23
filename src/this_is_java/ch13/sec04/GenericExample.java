package this_is_java.ch13.sec04;

public class GenericExample {
    public static <T extends Number> boolean compare(T t1, T t2) {
        double v1 = t1.doubleValue();
        double v2 = t2.doubleValue();

        return v1 == v2;
    }

    public static void main(String[] args) {
        boolean result1 = compare(10, 20);
        System.out.println("result1 = " + result1);
        System.out.println();

        boolean result2 = compare(4.5, 4.5);
        System.out.println("result2 = " + result2);

    }
}
