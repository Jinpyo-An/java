package inflearn_java_advanced02.was.v3;

import java.io.IOException;

public class ServerMainV3 {

    private static final int PORT = 12345;

    public static void main(String[] args) throws IOException {
        final HttpServerV3 server = new HttpServerV3(PORT);
        server.start();
    }
}
