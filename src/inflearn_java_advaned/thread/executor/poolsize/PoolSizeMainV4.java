package inflearn_java_advaned.thread.executor.poolsize;

import inflearn_java_advaned.thread.executor.RunnableTask;

import java.util.concurrent.*;

import static inflearn_java_advaned.thread.executor.ExecutorUtils.printState;
import static inflearn_java_advaned.util.MyLogger.log;

public class PoolSizeMainV4 {

//    static final int TASK_SIZE = 1100;
//    static final int TASK_SIZE = 1200;
    static final int TASK_SIZE = 1201;

    public static void main(String[] args) {
        final ExecutorService es = new ThreadPoolExecutor(100, 200,
                60, TimeUnit.SECONDS, new ArrayBlockingQueue<>(1000));
        printState(es);

        long startMs = System.currentTimeMillis();
        for (int i = 1; i <= TASK_SIZE ; i++) {
            String taskName = "task" + i;
            try {
                es.execute(new RunnableTask(taskName));
                printState(es, taskName);
            } catch (RejectedExecutionException e) {
                log(taskName + " -> " + e);
            }
        }

        es.close();
        long endMs = System.currentTimeMillis();
        log("time: " + (endMs - startMs));
    }
}
