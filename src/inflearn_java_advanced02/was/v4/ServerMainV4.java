package inflearn_java_advanced02.was.v4;

import java.io.IOException;

public class ServerMainV4 {

    private static final int PORT = 12345;

    public static void main(String[] args) throws IOException {
        final HttpServerV4 server = new HttpServerV4(PORT);
        server.start();
    }
}
