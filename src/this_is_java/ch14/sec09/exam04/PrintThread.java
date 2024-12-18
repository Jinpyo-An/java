package this_is_java.ch14.sec09.exam04;

public class PrintThread extends Thread{
    @Override
    public void run() {
        try {
            while (true){
                System.out.println("실행 중");
                Thread.sleep(1);
            }
        } catch (InterruptedException e) {}

        System.out.println("리소스 정리");
        System.out.println("실행 종료");
    }
}
