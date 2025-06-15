package inflearn_java_advanced03.stream.operation;

import java.util.Optional;

public class OptionalSimpleMain {

    public static void main(String[] args) {
        final Optional<Integer> optional1 = Optional.of(10);
        System.out.println("optional1 = " + optional1);
        if (optional1.isPresent()) {
            final Integer i = optional1.get();
            System.out.println("i = " + i);
        }

        final Optional<Object> optional2 = Optional.ofNullable(null);
        System.out.println("optional2 = " + optional2);
        if (optional2.isPresent()) {
            final Object o = optional2.get();
            System.out.println("o = " + o);
        }

        final Object o2 = optional2.get();
        System.out.println("o2 = " + o2);
    }
}
