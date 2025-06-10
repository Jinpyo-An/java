package inflearn_java_advanced03.methodref;

import java.util.function.Function;

public class MethodRefEx2 {

    public static void main(String[] args) {
        Function<String, String> staticMethod1 = name -> Person.greetingWithName(name);
        Function<String, String> staticMethod2 = Person::greetingWithName;

        System.out.println("staticMethod1 = " + staticMethod1.apply("kim"));
        System.out.println("staticMethod2 = " + staticMethod2.apply("kim"));

        final Person person = new Person("Kim");
        Function<Integer, String> instanceMethod1 = n -> person.introduceWithNumber(n);
        Function<Integer, String> instanceMethod2 = person::introduceWithNumber;

        System.out.println("instanceMethod1.get() = " + instanceMethod1.apply(1));
        System.out.println("instanceMethod2.get() = " + instanceMethod2.apply(2));

        Function<String, Person> newPerson1 = name -> new Person(name);
        Function<String, Person> newPerson2 = Person::new;

        final Person jinpyo = newPerson1.apply("jinpyo");
        final Person minseo = newPerson2.apply("minseo");

        System.out.println("newPerson1 = " + jinpyo);
        System.out.println("newPerson2 = " + minseo);
    }
}
