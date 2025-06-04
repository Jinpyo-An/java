package inflearn_java_advanced01.thread.executor.poolsize;

import inflearn_java_advanced01.thread.executor.RunnableTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static inflearn_java_advanced01.thread.executor.ExecutorUtils.printState;
import static inflearn_java_advanced01.util.MyLogger.log;
import static inflearn_java_advanced01.util.ThreadUtils.sleep;

public class PoolSizeMainV3 {

    public static void main(String[] args) {
        final ExecutorService es = Executors.newCachedThreadPool();

        log("pool 생성");
        printState(es);

        for (int i = 1; i <= 4; i++) {
            String taskName = "task" + i;
            es.execute(new RunnableTask(taskName));
            printState(es, taskName);
        }

        sleep(3000);
        log("== 작업 수행 완료 ==");
        printState(es);

        sleep(3000);
        log("== maximumPoolSize 대기 시간 초과 ==");
        printState(es);

        es.close();
        log("== shutdown 완료 == ");
        printState(es );
    }
}
