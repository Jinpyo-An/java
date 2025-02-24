package inflearn_java_advaned.thread.sync;

public interface BankAccount {

    boolean withdraw(int amount) throws InterruptedException;

    int getBalance();
}
