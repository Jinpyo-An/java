package inflearn_java_advanced2.io.start;

import java.io.IOException;
import java.io.PrintStream;

import static java.nio.charset.StandardCharsets.UTF_8;

public class PrintStreamMain {

    public static void main(String[] args) throws IOException {
        final PrintStream printStream = System.out;

        final byte[] bytes = "Hello\n".getBytes(UTF_8);
        printStream.write(bytes);
        printStream.println("Print!");
    }
}
