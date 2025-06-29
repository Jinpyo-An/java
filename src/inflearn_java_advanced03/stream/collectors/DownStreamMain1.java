package inflearn_java_advanced03.stream.collectors;

import java.util.List;
import java.util.stream.Collectors;

public class DownStreamMain1 {

    public static void main(String[] args) {
        final List<Student> students = List.of(
                new Student("Kim", 1, 85),
                new Student("Park", 1, 85),
                new Student("Lee", 1, 85),
                new Student("Han", 1, 85),
                new Student("Hoon", 1, 85),
                new Student("Ha", 1, 85)
        );

        students.stream()
                .collect(Collectors.groupingBy(
                        s -> s.
                ))
    }
}
