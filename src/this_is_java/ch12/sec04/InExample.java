package this_is_java.ch12.sec04;

public class InExample {
    public static void main(String[] args) throws Exception {
        int speed = 0;
        int keyCode = 0;

        while (true) {
            if (keyCode != 13 & keyCode != 10) {
                speed++;
            } else if (keyCode == 50) {
                speed--;

            } else if (keyCode == 51) {
                break;
            }

            System.out.println("현재 속도 = " + speed);

            keyCode = System.in.read();
        }
    }
}
