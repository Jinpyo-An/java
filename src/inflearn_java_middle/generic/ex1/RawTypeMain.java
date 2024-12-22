package inflearn_java_middle.generic.ex1;

public class RawTypeMain {

    public static void main(String[] args) {
//        GenericBox integerBox = new GenericBox();
        GenericBox<Object> integerBox = new GenericBox<>(); // 권장

    }
}
