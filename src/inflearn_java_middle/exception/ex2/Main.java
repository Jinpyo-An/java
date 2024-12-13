package inflearn_java_middle.exception.ex2;

import inflearn_java_middle.exception.ex2.exception.SendException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NetworkService networkService = new NetworkService();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("전송할 문자: ");
            String input = scanner.nextLine();

            if (input.equals("exit"))
                break;

            try {
                networkService.sendMessage(input);
            } catch (Exception e) {
                exceptionHandler(e);
            }
        }
        System.out.println("프로그램을 정상 종료합니다.");

    }

    private static void exceptionHandler(Exception e) {
        System.out.println("사용자 메시지: 죄송합니다. 알 수 없는 문제가 발생했습니다");
        System.out.println("==개발자용 디버깅 메시지==");
        e.printStackTrace(System.out);

        if (e instanceof SendException sendEx) {
            System.out.println("[전송 오류] 전송 데이터: " + sendEx.getSendData());
        }
    }
}
