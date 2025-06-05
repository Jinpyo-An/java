package inflearn_java_advanced03.lambda.ex1;

public class M1After {

    public static void greeting(String message) {
        System.out.println("=== 시작 ===");
        System.out.println(message);
        System.out.println("=== 끝 ===");
    }

    public static void main(String[] args) {
        greeting("Good Morning!");
        greeting("Good Afternoon");
        greeting("Good Evening");
    }
}
