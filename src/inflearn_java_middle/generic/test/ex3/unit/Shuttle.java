package inflearn_java_middle.generic.test.ex3.unit;

public class Shuttle<T extends BioUnit> {
    private T unit;

    public void in(T t) {
        this.unit = t;
    }

    public T out(T t) {
        return t;
    }

    public void showInfo() {
        System.out.println("이름 = " + unit.getName() + ", HP = " + unit.getHp());
    }
}
