package inflearn_java_advanced02.io.buffered;

import java.io.FileOutputStream;
import java.io.IOException;

import static inflearn_java_advanced02.io.buffered.BufferedConst.FILE_NAME;
import static inflearn_java_advanced02.io.buffered.BufferedConst.FILE_SIZE;

public class CreateFileV1 {

    public static void main(String[] args) throws IOException {
        final FileOutputStream fos = new FileOutputStream(FILE_NAME);
        final long startTime = System.currentTimeMillis();

        for (int i = 0; i < FILE_SIZE; i++) {
            fos.write(1);
        }
        fos.close();

        final long endTime = System.currentTimeMillis();
        System.out.println("File created: " + FILE_NAME);
        System.out.println("File size: " + FILE_SIZE / 1024 / 1024 + "MB");
        System.out.println("Time take: " + (endTime - startTime) + "ms");
    }
}
