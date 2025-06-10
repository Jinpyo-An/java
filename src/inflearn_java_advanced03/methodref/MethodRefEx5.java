package inflearn_java_advanced03.methodref;

import inflearn_java_advanced03.lambda.lambda.mystream.MyStreamV3;

import java.util.List;

public class MethodRefEx5 {

    public static void main(String[] args) {
        final List<Person> personList = List.of(
                new Person("Kim"),
                new Person("Park"),
                new Person("Lee")
        );

        final List<String> result1 = MyStreamV3.of(personList)
                .map(person -> person.introduce())
                .map(str -> str.toUpperCase())
                .toList();

        final List<String> result2 = MyStreamV3.of(personList)
                .map(Person::introduce)
                .map(String::toUpperCase)
                .toList();

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
