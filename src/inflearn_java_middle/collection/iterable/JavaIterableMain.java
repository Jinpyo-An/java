package inflearn_java_middle.collection.iterable;

import java.util.*;

public class JavaIterableMain {

    public static void main(String[] args) {
        final List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        printAll(list.iterator());
        printAllForEach(list);

        final Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        printAll(set.iterator());
        printAllForEach(set);
    }

    private static void printAll(Iterator<Integer> iterator) {
        System.out.println("iterator = " + iterator.getClass());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void printAllForEach(Iterable<Integer> iterable) {
        for (Integer integer : iterable) {
            System.out.println("integer = " + integer);
        }
    }
}
