package inflearn_java_middle.collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableMain {

    public static void main(String[] args) {
        final List<Integer> list = List.of(1, 2, 3);

        final ArrayList<Integer> mutableList = new ArrayList<>(list);
        mutableList.add(4);
        System.out.println("mutableList = " + mutableList);

        final List<Integer> unmodifiableList =  Collections.unmodifiableList(mutableList);
//        unmodifiableList.add(1);
    }
}
