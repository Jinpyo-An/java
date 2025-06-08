package inflearn_java_advanced03.lambda.lambda.mystream;

import java.util.ArrayList;
import java.util.List;

import static inflearn_java_advanced03.lambda.lambda.filter.GenericFilter.filter;
import static inflearn_java_advanced03.lambda.lambda.map.GenericMapper.map;

public class Ex2_Student {

    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Apple", 100),
                new Student("Banana", 80),
                new Student("Berry", 50),
                new Student("Tomato", 40)
        );

        final List<String> directResult = direct(students);
        System.out.println("directResult = " + directResult);

        final List<String> lambdaResult = lambda(students);
        System.out.println("lambdaResult = " + lambdaResult);
    }

    private static List<String> direct(List<Student> students) {
        final List<String> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getScore() >= 80) {
                result.add(student.getName());
            }
        }
        return result;
    }

    private static List<String> lambda(List<Student> students) {
        final List<Student> filteredList = filter(students, st -> st.getScore() >= 80);
        final List<String> mappedList = map(filteredList, st -> st.getName());
        return mappedList;
    }
}
