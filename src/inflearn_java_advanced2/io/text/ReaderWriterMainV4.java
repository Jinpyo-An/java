package inflearn_java_advanced2.io.text;

import java.io.*;

import static inflearn_java_advanced2.io.text.TextConst.FILE_NAME;
import static java.nio.charset.StandardCharsets.UTF_8;

public class ReaderWriterMainV4 {

    public static final int BUFFER_SIZE = 8192;

    public static void main(String[] args) throws IOException {
        String writeString = "ABC\n가나다";
        System.out.println("=== Write String ==");
        System.out.println(writeString);

        final FileWriter fw = new FileWriter(FILE_NAME, UTF_8);
        final BufferedWriter bw = new BufferedWriter(fw, BUFFER_SIZE);
        bw.write(writeString);
        bw.close();

        StringBuilder content = new StringBuilder();
        FileReader fr = new FileReader(FILE_NAME, UTF_8);
        final BufferedReader br = new BufferedReader(fr, BUFFER_SIZE);

        String line;
        while ((line = br.readLine()) != null) {
            content.append(line).append("\n");
        }

        br.close();
        System.out.println("== Read String ==");
        System.out.println(content);

    }
}
