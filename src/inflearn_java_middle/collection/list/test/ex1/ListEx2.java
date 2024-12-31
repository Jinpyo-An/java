package inflearn_java_middle.collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listNumber = new ArrayList<>();

        System.out.println("n개의 정수를 입력하세요 (종료 0)");

        while (true) {
            int element = scanner.nextInt();
            if (element == 0) break;
            listNumber.add(element);
        }

        for (int i = 0; i < listNumber.size(); i++) {
            System.out.print(listNumber.get(i));
            if (i < listNumber.size() - 1)
                System.out.print(", ");
        }
    }
}
