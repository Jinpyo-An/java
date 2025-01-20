package inflearn_java_middle.collection.set.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UniqueNamesTest1 {

    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};

        Set<Integer> intSet = new HashSet<>();

        for (Integer integer : inputArr) {
            intSet.add(integer);
        }

        final Iterator<Integer> iterator = intSet.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
