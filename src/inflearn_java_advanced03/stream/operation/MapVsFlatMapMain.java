package inflearn_java_advanced03.stream.operation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MapVsFlatMapMain {

    public static void main(String[] args) {
        final List<List<Integer>> outerList = List.of(
                List.of(1, 2),
                List.of(3, 4),
                List.of(5, 6)
        );

        final List<Integer> forResult = new ArrayList<>();
        for (List<Integer> list : outerList) {
            for (Integer i : list) {
                forResult.add(i);
            }
        }
        System.out.println("forResult = " + forResult);

        final List<Stream<Integer>> mapResult = outerList.stream()
                .map(list -> list.stream())
                .toList();
        System.out.println("mapResult = " + mapResult);

        final List<Integer> flatMapResult = outerList.stream()
                .flatMap(list -> list.stream())
                .toList();
        System.out.println("flatMapResult = " + flatMapResult);
    }
}
