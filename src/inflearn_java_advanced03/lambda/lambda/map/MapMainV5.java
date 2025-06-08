package inflearn_java_advanced03.lambda.lambda.map;

import java.util.List;

import static inflearn_java_advanced03.lambda.lambda.map.GenericMapper.*;

public class MapMainV5 {

    public static void main(String[] args) {
        final List<String> fruits = List.of("apple", "banana", "orange");

        final List<String> upperFruits = map(fruits, s -> s.toUpperCase());
        System.out.println("upperFruits = " + upperFruits);

        final List<Integer> lengthFruits = map(fruits, s -> s.length());
        System.out.println("lengthFruits = " + lengthFruits);

        final List<Integer> integers = List.of(1, 2, 3);
        final List<String> starList = map(integers, n -> "*".repeat(n));
        System.out.println("starList = " + starList);
    }
}
