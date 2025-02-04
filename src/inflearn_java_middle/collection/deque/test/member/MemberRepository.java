package inflearn_java_middle.collection.deque.test.member;

import java.util.HashMap;
import java.util.Map;

public class MemberRepository {

    private Map<String, Member> memberMap = new HashMap<>();

    public void save(Member member) {
        memberMap.put(member.getId(), member);
    }

    public void remove(String id) {
        memberMap.remove(id);
    }

    public Member findById(String id) {
        return memberMap.get(id);
    }

    public Member findByName(String name) {
        for (String key : memberMap.keySet()) {
            if (memberMap.get(key).getName() == name) {
                return memberMap.get(key);
            }
        }
        return null;
    }
}
