package inflearn_java_advanced03.lambda.ex2;

public class ComposeExample {

    public static MyTransformer compose(MyTransformer f1, MyTransformer f2) {

        return s -> {
            final String toUpper = f1.transform(s);
            return f2.transform(toUpper);
        };
    }

    public static void main(String[] args) {
        MyTransformer toUpper = s -> s.toUpperCase();

        MyTransformer addDeco = s -> "**" + s + "**";

        MyTransformer composeFunc = compose(toUpper, addDeco);

        System.out.println(composeFunc.transform("Hello Jinpyo"));
    }
}
