package inflearn_java_advanced02.was.v1;

import java.io.IOException;

public class ServerMainV1 {

    private static final int PORT = 12345;

    public static void main(String[] args) throws IOException {
        final HttpServerV1 server = new HttpServerV1(PORT);
        server.start();
    }
}
