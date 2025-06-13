package inflearn_java_advanced03.stream.basic;

import java.util.List;

public class ImmutableMain {

    public static void main(String[] args) {
        final List<Integer> originList = List.of(1, 2, 3, 4);
        System.out.println("originList = " + originList);

        final List<Integer> filteredList = originList.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println("filteredList = " + filteredList);
        System.out.println("originList = " + originList);
    }
}
