package inflearn_java_advaned.thread.bounded;

import static inflearn_java_advaned.util.MyLogger.log;

public class ConsumerTask implements Runnable {

    private BoundedQueue queue;

    public ConsumerTask(BoundedQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        log("[소비 시도]     ? <- " + queue);
        final String data = queue.take();
        log("[소비 완료] " + data + " <- " + queue);
    }
}
