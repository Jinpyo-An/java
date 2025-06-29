package inflearn_java_advanced03.stream.collectors;

public record Student(String name, int grade, int score) {
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", score=" + score +
                '}';
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public int grade() {
        return grade;
    }

    @Override
    public int score() {
        return score;
    }
}
