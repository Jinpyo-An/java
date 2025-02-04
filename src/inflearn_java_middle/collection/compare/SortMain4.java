package inflearn_java_middle.collection.compare;

import java.util.LinkedList;
import java.util.List;

public class SortMain4 {

    public static void main(String[] args) {
        final MyUser myUser1 = new MyUser("a", 30);
        final MyUser myUser2 = new MyUser("b", 20);
        final MyUser myUser3 = new MyUser("c", 10);

        final List<MyUser> list = new LinkedList<>();
        list.add(myUser1);
        list.add(myUser2);
        list.add(myUser3);
        System.out.println(list);

        list.sort(null);
        System.out.println(list);

        list.sort(new IdComparator());
        System.out.println(list);
    }
}
