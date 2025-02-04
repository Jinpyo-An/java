package inflearn_java_middle.collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class EmptyListMain {

    public static void main(String[] args) {
        final List<Integer> list1 = new ArrayList<>();
        final List<Integer> list2 = new LinkedList<>();

        final List<Integer> list3 = Collections.emptyList();
        final List<Integer> list4 = List.of();

        System.out.println("list3 = " + list3.getClass());
        System.out.println("list4 = " + list4.getClass() );
    }
}
