package inflearn_java_advanced03.stream.collectors;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collectors2Map {

    public static void main(String[] args) {
        final Map<String, Integer> map1 = Stream.of("Apple", "Banana", "Tomato")
                .collect(Collectors.toMap(
                        name -> name,
                        name -> name.length()
                ));
        System.out.println("map1 = " + map1);

        final Map<String, Integer> map3 = Stream.of("Apple", "Apple", "Tomato")
                .collect(Collectors.toMap(
                        name -> name,
                        name -> name.length(),
                        (oldValue, newValue) -> oldValue + newValue
                ));
        System.out.println("map3 = " + map3);

        final Map<String, Integer> map4 = Stream.of("Apple", "Apple", "Tomato")
                .collect(Collectors.toMap(
                        name -> name,
                        name -> name.length(),
                        (oldValue, newValue) -> oldValue + newValue,
                        LinkedHashMap::new
                ));
        System.out.println("map4 = " + map4.getClass());
    }
}
