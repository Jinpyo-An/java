package inflearn_java_middle.collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.println("n개의 정수를 입력하세요 (종료 0)");

        while (true) {
            int input = scanner.nextInt();
            if (input == 0) break;
            list.add(input);
        }

        int total = 0;
        for (Integer integer : list) {
            total += integer;
        }

        System.out.println("입력한 정수의 합계: " + total);

        System.out.println("입력한 정수의 평균: " + (double) total/list.size());
    }
}
