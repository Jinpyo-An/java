package inflearn_java_advanced03.methodref;

import java.util.function.BiFunction;

public class MethodRefEx6 {

    public static void main(String[] args) {
        final Person person = new Person("Kim");

        BiFunction<Person, Integer, String> fun1 =
                (p, number) -> p.introduceWithNumber(number);

        System.out.println("person.introduceWithNumber = " + fun1.apply(person, 1));

        BiFunction<Person, Integer, String> fun2 = Person::introduceWithNumber;
        System.out.println("person.introduceWithNumber = " + fun1.apply(person, 3));

    }
}
