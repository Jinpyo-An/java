package inflearn_java_advanced01.thread.cas;

import java.util.concurrent.atomic.AtomicInteger;

public class CasMain1 {

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        System.out.println("start value = " + atomicInteger.get());

        final boolean result1 = atomicInteger.compareAndSet(0, 1);
        System.out.println("result1 = "+ result1 + ", value = " + atomicInteger.get());

        final boolean result2 = atomicInteger.compareAndSet(0, 1);
        System.out.println("result1 = "+ result2 + ", value = " + atomicInteger.get());
    }
}
