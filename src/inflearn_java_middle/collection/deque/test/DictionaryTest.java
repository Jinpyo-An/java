package inflearn_java_middle.collection.deque.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {

    public static void main(String[] args) {
        Map<String, String> dictionaryMap = new HashMap<>();

        System.out.println("==단어 입력 단계==");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("영어 단어을 입력하세요 (종료는 'q'): ");
            String key = scanner.nextLine();

            if (key.equals("q")) break;

            System.out.print("한글 뜻을 입력하세요: ");
            String value = scanner.nextLine();

            dictionaryMap.put(key, value);
        }

        System.out.println("==단어 검색 단계==");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("영어 단어을 입력하세요 (종료는 'q'): ");
            String key = scanner.nextLine();

            if (key.equals("q")) break;
            if (dictionaryMap.containsKey(key)) {
                System.out.println(key + "의 뜻: " + dictionaryMap.get(key));
            } else {
                System.out.println(key + "은(는) 사전에 없는 단어입니다.");
            }

        }
    }
}
