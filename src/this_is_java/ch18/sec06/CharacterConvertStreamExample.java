package this_is_java.ch18.sec06;

import java.io.*;

public class CharacterConvertStreamExample {

    public static void main(String[] args) throws Exception {

        write("문자 변환 시트림을 사용합니다.");
        String data = read();
        System.out.println(data);
    }

    private static String read() throws Exception {
        InputStream is = new FileInputStream("/Users/anjinpyo/developments/study/java/java_basic/src/this_is_java/ch18/sec04/exam01/test.txt");
        Reader reader = new InputStreamReader(is, "UTF-8");
        char[] data = new char[100];
        int num = reader.read(data);
        reader.close();
        String str = new String(data, 0, num);
        return str;
    }

    private static void write(String str) throws Exception {
        OutputStream os = new FileOutputStream("/Users/anjinpyo/developments/study/java/java_basic/src/this_is_java/ch18/sec04/exam01/test.txt");
        Writer writer = new OutputStreamWriter(os, "UTF-8");
        writer.write(str);
        writer.flush();
        writer.close();
    }
}
