package inflearn_java_middle.collection.iterable;

import java.util.Iterator;

public class MyArrayMain {

    public static void main(String[] args) {
        final MyArray myArray = new MyArray(new int[]{1, 2, 3, 4, 5});
        final Iterator<Integer> iterator = myArray.iterator();

        while (iterator.hasNext()) {
            final Integer value = iterator.next();
            System.out.println("value = " + value);
        }

        for (Integer value : myArray) {
            System.out.println("value = " + value);
        }
    }
}
