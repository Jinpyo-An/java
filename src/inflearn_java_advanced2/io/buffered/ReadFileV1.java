package inflearn_java_advanced2.io.buffered;

import java.io.FileInputStream;
import java.io.IOException;

import static inflearn_java_advanced2.io.buffered.BufferedConst.FILE_NAME;

public class ReadFileV1 {

    public static void main(String[] args) throws IOException {
        final FileInputStream fis = new FileInputStream(BufferedConst.FILE_NAME);
        final long startTime = System.currentTimeMillis();

        int fileSize = 0;
        int data;
        while ((data = fis.read()) != -1) {
            fileSize++;
        }

        fis.close();


        final long endTime = System.currentTimeMillis();
        System.out.println("File name: " + FILE_NAME);
        System.out.println("File size: " + fileSize / 1024 / 1024 + "MB");
        System.out.println("Time take: " + (endTime - startTime) + "ms");
    }
}
