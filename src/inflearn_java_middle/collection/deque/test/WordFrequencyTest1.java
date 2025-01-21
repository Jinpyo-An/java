package inflearn_java_middle.collection.deque.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {

    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";

        String[] textArr = text.split(" ");

        Map<String, Integer> WordFrequencyMap = new HashMap<>();
        WordFrequencyMap.put("orange", 0);
        WordFrequencyMap.put("banana", 0);
        WordFrequencyMap.put("apple", 0);

        for (String st : textArr) {
            if (WordFrequencyMap.containsKey(st)) {
                WordFrequencyMap.put(st, WordFrequencyMap.get(st) + 1);
            }
        }

        System.out.println(WordFrequencyMap);
    }
}
