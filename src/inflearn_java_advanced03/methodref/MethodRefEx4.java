package inflearn_java_advanced03.methodref;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MethodRefEx4 {

    public static void main(String[] args) {
        final List<Person> personList = List.of(
                new Person("Kim"),
                new Person("Park"),
                new Person("Lee")
        );

        final List<String> result1 = mapPersonToString(personList, person -> person.introduce());
        final List<String> result2 = mapPersonToString(personList, Person::introduce);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        final List<String> result3 = mapStringToString(result2, s -> s.toUpperCase());
        final List<String> result4 = mapStringToString(result2, String::toUpperCase);
        System.out.println("result3 = " + result3);
        System.out.println("result4 = " + result4);
    }

    static List<String> mapPersonToString(List<Person> personList, Function<Person, String> fun) {
        List<String> result = new ArrayList<>();
        for (Person person : personList) {
            final String applied = fun.apply(person);
            result.add(applied);
        }
        return result;
    }

    static List<String> mapStringToString(List<String> strings, Function<String, String> fun) {
        final List<String> result = new ArrayList<>();
        for (String string : strings) {
            final String applied = fun.apply(string);
            result.add(applied);
        }
        return result;
    }
}
