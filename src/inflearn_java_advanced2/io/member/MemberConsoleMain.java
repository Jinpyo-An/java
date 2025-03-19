package inflearn_java_advanced2.io.member;

import inflearn_java_advanced2.io.member.impl.ObjectMemberRepository;

import java.util.List;
import java.util.Scanner;

public class MemberConsoleMain {

//    private static final MemberRepository repository = new MemoryMemberRepository();
//    private static final MemberRepository repository = new FileMemberRepository();
//    private static final MemberRepository repository = new DataMemberRepository();
    private static final MemberRepository repository = new ObjectMemberRepository();

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1.회원 등록 | 2.회원 목록 조회 | 3.종료");
            System.out.print("선택: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    registerMember(scanner);
                    break;
                case 2:
                    displayMembers();
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 선택입니다. 다시 입력하세요.");
            }
        }
    }

    private static void registerMember(Scanner scanner) {
        System.out.print("ID 입력: ");
        final String id = scanner.nextLine();

        System.out.print("Name 입력: ");
        final String name = scanner.nextLine();

        System.out.print("Age 입력: ");
        final int age = scanner.nextInt();
        scanner.nextLine();

        final Member newMember = new Member(id, name, age);
        repository.add(newMember);
        System.out.println("회원이 성공적으로 등록되었습니다.");
    }

    private static void displayMembers() {
        final List<Member> members = repository.findAll();
        System.out.println("회원 목록:");
        for (Member member : members) {
            System.out.printf("[ID: %s, Name: %s, Age: %d]\n", member.getId(), member.getName(), member.getAge());
        }
    }
}
