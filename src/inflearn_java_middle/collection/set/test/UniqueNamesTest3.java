package inflearn_java_middle.collection.set.test;

import java.util.*;

public class UniqueNamesTest3 {

    public static void main(String[] args) {
        Set<Integer> intSet = new TreeSet<>(List.of(30, 20, 20, 10, 10));

        for (Integer integer : intSet) {
            System.out.println(integer);
        }
    }
}
