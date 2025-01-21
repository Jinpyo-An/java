package inflearn_java_middle.collection.deque.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CommonKeyValueSum1 {

    public static void main(String[] args) {
        Map<String, Integer> map1 = Map.of("A", 1, "B", 2, "C", 3);
        Map<String, Integer> map2 = Map.of("B", 4, "C", 5, "D", 6);

        Map<String, Integer> differMap = new HashMap<>();

        final Set<String> keySet = map2.keySet();

        for (String key : keySet) {
            if (map1.containsKey(key)) {
                differMap.put(key, map1.get(key) + map2.get(key));
            }
        }

        System.out.println(differMap);
    }
}
