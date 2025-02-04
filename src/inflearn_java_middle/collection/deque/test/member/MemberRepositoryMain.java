package inflearn_java_middle.collection.deque.test.member;

public class MemberRepositoryMain {

    public static void main(String[] args) {
        final Member member1 = new Member("id1", "회원1");
        final Member member2 = new Member("id2", "회원2");
        final Member member3 = new Member("id3", "회원3");

        final MemberRepository repository = new MemberRepository();
        repository.save(member1);
        repository.save(member2);
        repository.save(member3);

        final Member findMember1 = repository.findById("id1");
        System.out.println("findMember1 = " + findMember1);

        final Member findMember3 = repository.findByName("회원3");
        System.out.println("findMember3 = " + findMember3);

        repository.remove("id1");
        final Member removeMember1 = repository.findById("id1");
        System.out.println("removeMember1 = " + removeMember1);
    }
}
