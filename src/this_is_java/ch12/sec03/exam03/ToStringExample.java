package this_is_java.ch12.sec03.exam03;

public class ToStringExample {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("삼성전자", "안드로이드");

        String obj = smartPhone.toString();
        System.out.println(obj);

        System.out.println(smartPhone);
    }
}
