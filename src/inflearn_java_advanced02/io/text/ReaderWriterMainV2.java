package inflearn_java_advanced02.io.text;

import java.io.*;

import static inflearn_java_advanced02.io.text.TextConst.FILE_NAME;
import static java.nio.charset.StandardCharsets.UTF_8;

public class ReaderWriterMainV2 {

    public static void main(String[] args) throws IOException {
        String writeString = "ABC";
        System.out.println("write String: " + writeString);

        final FileOutputStream fos = new FileOutputStream(FILE_NAME);
        final OutputStreamWriter osw = new OutputStreamWriter(fos, UTF_8);

        osw.write(writeString);
        osw.close();

        final FileInputStream fis = new FileInputStream(FILE_NAME);
        final InputStreamReader isr = new InputStreamReader(fis, UTF_8);

        StringBuilder content = new StringBuilder();
        int ch;
        while ((ch = isr.read()) != -1) {
            content.append((char) ch);
        }

        isr.close();

        System.out.println("read String: " + content);
    }
}
