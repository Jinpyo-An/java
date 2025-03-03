package inflearn_java_advaned.thread.cas;

import java.util.concurrent.atomic.AtomicInteger;

import static inflearn_java_advaned.util.MyLogger.log;

public class CasMain2 {

    public static void main(String[] args) {
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        System.out.println("start value = " + atomicInteger.get());

        // incrementAndGet 구현
        final int resultValue1 = incrementAndGet(atomicInteger);
        System.out.println("resultValue2 = " + resultValue1);

        final int resultValue2 = incrementAndGet(atomicInteger);
        System.out.println("resultValue2 = " + resultValue2);
    }

    private static int incrementAndGet(AtomicInteger atomicInteger) {
        int getValue;
        boolean result;
        do {
            getValue = atomicInteger.get();
            log("getValue = " + getValue);
            result = atomicInteger.compareAndSet(getValue, getValue + 1);
            log("result: " + result);
        } while (!result);

        return getValue + 1;
    }
}
