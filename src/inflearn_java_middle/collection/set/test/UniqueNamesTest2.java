package inflearn_java_middle.collection.set.test;

import java.util.*;

public class UniqueNamesTest2 {

    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};

        Set<Integer> intSet = new LinkedHashSet<>(List.of(inputArr));

        final Iterator<Integer> iterator = intSet.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
