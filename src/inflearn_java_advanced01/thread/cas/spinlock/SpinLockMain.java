package inflearn_java_advanced01.thread.cas.spinlock;

import static inflearn_java_advanced01.util.MyLogger.log;
import static inflearn_java_advanced01.util.ThreadUtils.sleep;

public class SpinLockMain {

    public static void main(String[] args) {
//        SpinLockBad spinLock = new SpinLockBad();
        SpinLock spinLock = new SpinLock();

        final Runnable task = new Runnable() {
            @Override
            public void run() {
                spinLock.lock();
                try {
                    log("비즈니스 로직 실행");
                    sleep(1);
                } finally {
                    spinLock.unlock();
                }
            }
        };

        final Thread t1 = new Thread(task, "Thread-1");
        final Thread t2 = new Thread(task, "Thread-2");

        t1.start();
        t2.start();
    }
}
