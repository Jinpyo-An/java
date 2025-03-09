package inflearn_java_advaned.thread.executor.future;

import java.util.concurrent.*;

import static inflearn_java_advaned.util.MyLogger.log;
import static inflearn_java_advaned.util.ThreadUtils.sleep;

public class FutureExceptionMain {

    public static void main(String[] args) {
        final ExecutorService es = Executors.newFixedThreadPool(1);

        log("작업 전달");
        final Future<Integer> future = es.submit(new ExCallable());
        sleep(1000);

        try {
            log("future.get() 호출 시도, future.state(): " + future.state());
            final Integer result = future.get();
            log("result value = " + result);
        } catch (ExecutionException e) {
            log("e = " + e);
            final Throwable cause = e.getCause();
            log("cause = " + cause);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        es.close();
    }

    static class ExCallable implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {
            log("Callable 실행, 예외 발생");
            throw new IllegalStateException("ex!");
        }
    }
}
