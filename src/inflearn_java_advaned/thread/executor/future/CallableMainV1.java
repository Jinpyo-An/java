package inflearn_java_advaned.thread.executor.future;

import java.util.Random;
import java.util.concurrent.*;

import static inflearn_java_advaned.util.MyLogger.log;
import static inflearn_java_advaned.util.ThreadUtils.sleep;

public class CallableMainV1 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        final ExecutorService es = Executors.newFixedThreadPool(1);
        final Future<Integer> future = es.submit(new MyCallable());
        final Integer result = future.get();
        log("result value = " + result);
        es.close();
    }

    static class MyCallable implements Callable<Integer> {

        @Override
        public Integer call() {
            log("Callable 시작");
            sleep(2000);
            final int value = new Random().nextInt(10);
            log("create value = " + value);
            log("Callable 완료");
            return value;
        }
    }
}
