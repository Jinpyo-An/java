package inflearn_java_advanced2.io.buffered;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import static inflearn_java_advanced2.io.buffered.BufferedConst.*;

public class CreateFileV3 {

    public static void main(String[] args) throws IOException {
        final FileOutputStream fos = new FileOutputStream(FILE_NAME);
        final BufferedOutputStream bos = new BufferedOutputStream(fos, BUFFER_SIZE);

        final long startTime = System.currentTimeMillis();

        for (int i = 0; i < FILE_SIZE; i++) {
            bos.write(1);
        }
        bos.close();

        final long endTime = System.currentTimeMillis();
        System.out.println("File created: " + FILE_NAME);
        System.out.println("File size: " + FILE_SIZE / 1024 / 1024 + "MB");
        System.out.println("Time take: " + (endTime - startTime) + "ms");
    }
}
