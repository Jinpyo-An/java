package inflearn_java_advanced03.lambda.lambda.map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MapMainV2 {

    public static void main(String[] args) {
        final List<String> list = List.of("1", "12", "123", "1234");

        final List<Integer> numbers = map(list, s -> Integer.parseInt(s));
        System.out.println("numbers = " + numbers);

        final List<Integer> lengths = map(list, s -> s.length());
        System.out.println("lengths = " + lengths);
    }

    private static List<Integer> map(List<String> list, Function<String, Integer> mapper) {
        final List<Integer> result = new ArrayList<>();
        for (String s : list) {
            result.add(mapper.apply(s));
        }
        return result;
    }
}
