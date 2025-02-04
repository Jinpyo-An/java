package inflearn_java_middle.collection.utils;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class OfMain {

    public static void main(String[] args) {
        final List<Integer> list = List.of(1, 2, 3);
        final Set<Integer> set = Set.of(1, 2, 3);
        final Map<Integer, String> map = Map.of(1, "one", 2, "two", 3, "tree");

        System.out.println("list = " + list);
        System.out.println("set = " + set);
        System.out.println("map = " + map);

    }
}
