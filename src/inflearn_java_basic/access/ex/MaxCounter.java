package inflearn_java_basic.access.ex;

public class MaxCounter {
    private int count = 0;
    int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if (count >= max) {
            System.out.println("최대값을 초과할 수 없습니다.");
        } else {
            count += 1;
        }
    }

    public int getCount() {
        return count;
    }
}
