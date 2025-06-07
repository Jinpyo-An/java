package inflearn_java_advanced03.lambda.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class MapExample {

    public static List<String> map(List<String> list, UnaryOperator<String> operator) {
        List<String> result = new ArrayList<>();

        for (String str : list) {
            final String transStr = operator.apply(str);
            result.add(transStr);
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> words = List.of("hello", "java", "lambda");
        System.out.println("원본 리스트: "+ words);

        final List<String> upperList = map(words, s -> s.toUpperCase());
        System.out.println("대문자 변환 결과: "+ upperList);

        final List<String> decoratedList = map(words, s -> "***"  +s+ "***");
        System.out.println("특수문자 데코 결과: "+ decoratedList);
    }
}
