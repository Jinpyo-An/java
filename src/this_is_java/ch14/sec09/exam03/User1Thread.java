package this_is_java.ch14.sec09.exam03;

public class User1Thread extends Thread{
    private Calculator calculator;

    public User1Thread() {
        setName("User1Thread");
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run() {
        calculator.setMemory1(100);
    }
}
