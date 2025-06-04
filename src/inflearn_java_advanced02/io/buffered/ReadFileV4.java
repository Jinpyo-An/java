package inflearn_java_advanced02.io.buffered;

import java.io.FileInputStream;
import java.io.IOException;

import static inflearn_java_advanced02.io.buffered.BufferedConst.FILE_NAME;

public class ReadFileV4 {

    public static void main(String[] args) throws IOException {
        final FileInputStream fis = new FileInputStream(BufferedConst.FILE_NAME);
        final long startTime = System.currentTimeMillis();


        byte[] bytes = fis.readAllBytes();
        fis.close();


        final long endTime = System.currentTimeMillis();
        System.out.println("File name: " + FILE_NAME);
        System.out.println("File size: " + bytes.length / 1024 / 1024 + "MB");
        System.out.println("Time take: " + (endTime - startTime) + "ms");
    }
}
