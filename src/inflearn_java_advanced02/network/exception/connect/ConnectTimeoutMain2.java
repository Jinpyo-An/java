package inflearn_java_advanced02.network.exception.connect;

import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ConnectTimeoutMain2 {

    public static void main(String[] args) throws IOException {
        final long start = System.currentTimeMillis();

        try {
            final Socket socket = new Socket();
            socket.connect(new InetSocketAddress("192.168.1.250", 45678), 1000);
        } catch (ConnectException e) {
            e.printStackTrace();
        }


        final long end = System.currentTimeMillis();

        System.out.println("end = " + (end - start));
    }
}
