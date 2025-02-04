package inflearn_java_middle.collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SyncMain {

    public static void main(String[] args) {
        final List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("list class = " + list.getClass());
        final List<Integer> synchronizedList = Collections.synchronizedList(list);
        System.out.println("synchronizedList = " + synchronizedList.getClass());
    }
}
