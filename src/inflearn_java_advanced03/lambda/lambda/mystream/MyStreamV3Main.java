package inflearn_java_advanced03.lambda.lambda.mystream;

import java.util.List;

public class MyStreamV3Main {

    public static void main(String[] args) {
        final List<Student> students = List.of(
                new Student("Apple", 100),
                new Student("Banana", 80),
                new Student("Berry", 50),
                new Student("Tomato", 40)
        );

        final List<String> result1 = ex1(students);
        System.out.println("result1 = " + result1);

        final List<String> result2 = ex2(students);
        System.out.println("result2 = " + result2);

    }

    private static List<String> ex1(List<Student> students) {
        return MyStreamV3.of(students)
                .filter(s -> s.getScore() >= 80)
                .map(s -> s.getName())
                .toList();
    }

    private static List<String> ex2(List<Student> students) {
        return MyStreamV3.of(students)
                .filter(s -> s.getScore() >= 80)
                .filter(s -> s.getName().length() == 5)
                .map(s -> s.getName().toUpperCase())
                .toList();
    }
}
