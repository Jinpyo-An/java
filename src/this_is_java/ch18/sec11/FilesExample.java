package this_is_java.ch18.sec11;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesExample {

    public static void main(String[] args) {

        try {
            String data  = "" + "id: writer\n" + "email: winter@naver.com\n" + "tel: 010-1234-1234";

            Path path = Paths.get("path");

            Files.writeString(Paths.get("path"), data, Charset.forName("UTF-8"));

            System.out.println(Files.probeContentType(path));
            System.out.println(Files.size(path) + " bytes");

            String content = Files.readString(path, Charset.forName("UTF-8"));
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}