package inflearn_java_middle.generic.ex5;

import inflearn_java_middle.generic.animal.Animal;
import inflearn_java_middle.generic.animal.Cat;
import inflearn_java_middle.generic.animal.Dog;

public class WildcardMain1 {

    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("멍멍이", 100));

        WildcardEx.printGenericV1(dogBox);
        WildcardEx.printWildcard1(dogBox);

        WildcardEx.printGenericV2(dogBox);
        WildcardEx.printWildcard2(dogBox);

        Dog dog = WildcardEx.printAndReturnGeneric(dogBox);
        Animal animal = WildcardEx.printAndReturnWildcard(dogBox);


    }
}
