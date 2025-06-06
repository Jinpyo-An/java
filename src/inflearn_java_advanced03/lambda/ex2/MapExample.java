package inflearn_java_advanced03.lambda.ex2;

import java.util.ArrayList;
import java.util.List;

public class MapExample {

    public static List<String> map(List<String> list, StringFunction function) {
        List<String> result = new ArrayList<>();

        for (String str : list) {
            final String transStr = function.apply(str);
            result.add(transStr);
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> words = List.of("hello", "java", "lambda");
        System.out.println("원본 리스트: "+ words);

        final List<String> upperWords = map(words, (str) -> str.toUpperCase());
        System.out.println("대문자 변환 결과: "+ upperWords);

        final List<String> decoWords = map(words, (str) -> "***" + str + "***");
        System.out.println("특수 문자 데코 결과: "+ decoWords);
    }
}
