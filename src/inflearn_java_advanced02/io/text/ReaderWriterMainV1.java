package inflearn_java_advanced02.io.text;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

import static inflearn_java_advanced02.io.text.TextConst.FILE_NAME;
import static java.nio.charset.StandardCharsets.UTF_8;

public class ReaderWriterMainV1 {

    public static void main(String[] args) throws IOException {
        String writeString = "ABC";

        final byte[] writeBytes = writeString.getBytes(UTF_8);
        System.out.println("write String: " + writeString);
        System.out.println("write bytes: " + Arrays.toString(writeBytes));

        final FileOutputStream fos = new FileOutputStream(FILE_NAME);
        fos.write(writeBytes);
        fos.close();

        final FileInputStream fis = new FileInputStream(FILE_NAME);
        final byte[] readBytes = fis.readAllBytes();
        fis.close();

        final String readString = new String(readBytes, UTF_8);

        System.out.println("read Bytes: " + Arrays.toString(readBytes));
        System.out.println("read String: " + readString);
    }
}
