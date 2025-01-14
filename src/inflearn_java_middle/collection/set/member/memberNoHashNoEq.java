package inflearn_java_middle.collection.set.member;

public class memberNoHashNoEq {

    private String id;

    public memberNoHashNoEq(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "memberNoHashNoEq{" +
                "id='" + id + '\'' +
                '}';
    }
}
