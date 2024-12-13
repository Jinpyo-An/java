package this_is_java.ch11.sec04;

public class MyResource implements AutoCloseable{
    private String name;

    public MyResource(String name) {
        this.name = name;
        System.out.println(name + " 파일 열기");
    }

    public String read1() {
        System.out.println(name + " 파일 읽기");
        return "100";
    }

    public String read2() {
        System.out.println(name + " 파일 읽기");
        return "abc";
    }

    @Override
    public void close() throws Exception {
        System.out.println("파일 닫기");
    }
}
