package this_is_java.ch18.sec03.exam03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {

    public static void main(String[] args) throws Exception {
        String originalName = "/Users/anjinpyo/developments/study/java/java_basic/src/this_is_java/ch18/sec03/exam03/face.jpeg";
        String targetFileName = "/Users/anjinpyo/developments/study/java/java_basic/src/this_is_java/ch18/sec03/exam03/face2.jpeg";

        InputStream is = new FileInputStream(originalName);
        OutputStream os = new FileOutputStream(targetFileName);

        byte[] data = new byte[1024];
        while (true) {
            int num = is.read(data);
            if (num == -1) break;
            os.write(data, 0, num);
        }

        os.flush();
        os.close();
        is.close();
    }
}