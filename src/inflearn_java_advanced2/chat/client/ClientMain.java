package inflearn_java_advanced2.chat.client;

import java.io.IOException;

public class ClientMain {

    private static final int PORT = 12345;

    public static void main(String[] args) throws IOException {
        final Client client = new Client("localhost", PORT);
        client.start();
    }
}
