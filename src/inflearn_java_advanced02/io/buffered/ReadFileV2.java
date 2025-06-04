package inflearn_java_advanced02.io.buffered;

import java.io.FileInputStream;
import java.io.IOException;

import static inflearn_java_advanced02.io.buffered.BufferedConst.BUFFER_SIZE;
import static inflearn_java_advanced02.io.buffered.BufferedConst.FILE_NAME;

public class ReadFileV2 {

    public static void main(String[] args) throws IOException {
        final FileInputStream fis = new FileInputStream(BufferedConst.FILE_NAME);
        final long startTime = System.currentTimeMillis();


        byte[] buffer = new byte[BUFFER_SIZE];
        int fileSize = 0;
        int size;
        while ((size = fis.read(buffer)) != -1) {
            fileSize += size;
        }

        fis.close();


        final long endTime = System.currentTimeMillis();
        System.out.println("File name: " + FILE_NAME);
        System.out.println("File size: " + fileSize / 1024 / 1024 + "MB");
        System.out.println("Time take: " + (endTime - startTime) + "ms");
    }
}
