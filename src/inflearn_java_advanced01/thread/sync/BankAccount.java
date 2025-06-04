package inflearn_java_advanced01.thread.sync;

public interface BankAccount {

    boolean withdraw(int amount) throws InterruptedException;

    int getBalance();
}
