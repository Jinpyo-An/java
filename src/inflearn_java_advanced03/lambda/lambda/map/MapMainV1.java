package inflearn_java_advanced03.lambda.lambda.map;

import java.util.ArrayList;
import java.util.List;

public class MapMainV1 {

    public static void main(String[] args) {
        final List<String> list = List.of("1", "12", "123", "1234");

        final List<Integer> numbers = mapStringToInteger(list);
        System.out.println("numbers = " + numbers);

        final List<Integer> lengths = mapStringToLength(list);
        System.out.println("lengths = " + lengths);
    }

    private static List<Integer> mapStringToInteger(List<String> list) {
        final List<Integer> numbers = new ArrayList<>();
        for (String s : list) {
            numbers.add(Integer.valueOf(s));
        }
        return numbers;
    }

    private static List<Integer> mapStringToLength(List<String> list) {
        final List<Integer> numbers = new ArrayList<>();
        for (String s : list) {
            numbers.add(s.length());
        }
        return numbers;
    }
}
