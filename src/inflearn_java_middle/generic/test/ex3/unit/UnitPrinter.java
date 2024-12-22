package inflearn_java_middle.generic.test.ex3.unit;

public class UnitPrinter {
    public static <T extends Shuttle> void printV1(T t) {
        t.showInfo();
    }

    public static void printV2(Shuttle<? extends BioUnit> t) {
        t.showInfo();
    }


}
