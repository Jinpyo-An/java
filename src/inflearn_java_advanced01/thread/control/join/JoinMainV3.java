package inflearn_java_advanced01.thread.control.join;

import static inflearn_java_advanced01.util.MyLogger.log;
import static inflearn_java_advanced01.util.ThreadUtils.sleep;

public class JoinMainV3 {

    public static void main(String[] args) throws InterruptedException {
        log("Start");

        final SumTask task1 = new SumTask(1, 50);
        final SumTask task2 = new SumTask(51, 100);
        final Thread thread1 = new Thread(task1, "thread-1");
        final Thread thread2 = new Thread(task2, "thread-2");

        thread1.start();
        thread2.start();

        // 스레드가 종료될 때까지 대기
        log("join() - main 스레드가 thread1, thread2 종료까지 대기");
        thread1.join();
        thread2.join();
        log("main 스레드 대기 완료");

        log("task1.result = " + task1.result);
        log("task2.result = " + task2.result);

        int sumAll = task2.result + task2.result;
        log("task1 + task2 = " + sumAll);

        log("End");
    }

    static class SumTask implements Runnable {
        int startValue;
        int endValue;
        int result;

        public SumTask(int startValue, int endValue) {
            this.startValue = startValue;
            this.endValue = endValue;
        }

        @Override
        public void run() {
            log("작업 시작");
            sleep(2000);

            int sum = 0;
            for (int i = startValue; i <= endValue; i++) {
                sum += i;
            }
            result = sum;

            log("작업 완료 result = " + result);
        }
    }
}
