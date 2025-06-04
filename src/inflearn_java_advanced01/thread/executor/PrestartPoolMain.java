package inflearn_java_advanced01.thread.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import static inflearn_java_advanced01.thread.executor.ExecutorUtils.*;
import static inflearn_java_advanced01.util.ThreadUtils.sleep;

public class PrestartPoolMain {

    public static void main(String[] args) {
        final ExecutorService es = Executors.newFixedThreadPool(1000);
        printState(es);
        final ThreadPoolExecutor poolExecutor = (ThreadPoolExecutor) es;
        poolExecutor.prestartAllCoreThreads();
        sleep(1000);
        printState(es);
    }
}
