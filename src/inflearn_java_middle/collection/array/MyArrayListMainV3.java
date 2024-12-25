package inflearn_java_middle.collection.array;

public class MyArrayListMainV3 {

    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();

        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        list.add(3, "addList");
        System.out.println(list);

        System.out.println();
        System.out.println("addFirst");
        list.add(0, "addFirst");
        System.out.println(list);

        System.out.println();
        Object removed1 = list.remove(4);
        System.out.println("removed(4) = " + removed1);
        System.out.println(list);

        System.out.println();
        Object removed2 = list.remove(0);
        System.out.println("removed(0) = " + removed2);
        System.out.println(list);
    }
}
