package inflearn_java_advanced03.lambda.lambda.map;

import java.util.List;

import static inflearn_java_advanced03.lambda.lambda.map.StringToIntegerMapper.*;

public class MapMainV3 {

    public static void main(String[] args) {
        final List<String> list = List.of("1", "12", "123", "1234");

        final List<Integer> numbers = map(list, s -> Integer.parseInt(s));
        System.out.println("numbers = " + numbers);

        final List<Integer> lengths = map(list, s -> s.length());
        System.out.println("lengths = " + lengths);
    }
}
