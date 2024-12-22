package inflearn_java_middle.generic.ex3;

import inflearn_java_middle.generic.animal.Animal;
import inflearn_java_middle.generic.animal.Cat;
import inflearn_java_middle.generic.animal.Dog;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("나옹이", 300);

        dogHospital.set(dog);
        dogHospital.checkup();

        catHospital.set(cat);
        catHospital.checkup();


//        dogHospital.set(cat);

        dogHospital.set(dog);
        Animal biggerDog = (Dog) dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}
