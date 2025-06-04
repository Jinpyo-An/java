package inflearn_java_advanced01.thread.control;

import inflearn_java_advanced01.thread.start.HelloRunnable;

import static inflearn_java_advanced01.util.MyLogger.log;

public class ThreadInfoMain {

    public static void main(String[] args) {
        final Thread mainThread = Thread.currentThread();
        log("mainThread = " + mainThread);
        System.out.println("mainThread.threadId() = " + mainThread.threadId());
        System.out.println("mainThread.getName() = " + mainThread.getName());
        System.out.println("mainThread.getPriority() = " + mainThread.getPriority());
        System.out.println("mainThread.getThreadGroup() = " + mainThread.getThreadGroup());
        System.out.println("mainThread.getState() = " + mainThread.getState());

        System.out.println();

        final Thread myThread = new Thread(new HelloRunnable(), "myThread");
        log("myThread = " + myThread);
        System.out.println("myThread.threadId() = " + myThread.threadId());
        System.out.println("myThread.getName() = " + myThread.getName());
        System.out.println("myThread.getPriority() = " + myThread.getPriority());
        System.out.println("myThread.getThreadGroup() = " + myThread.getThreadGroup());
        System.out.println("myThread.getState() = " + myThread.getState());
    }
}
