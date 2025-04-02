package inflearn_java_advanced2.network.exception.close.reset;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;

import static inflearn_java_advaned.util.MyLogger.log;

public class ResetCloseClient {

    public static void main(String[] args) throws IOException, InterruptedException {
        final Socket socket = new Socket("localhost", 12345);
        log("소켓 연결: " + socket);
        final InputStream input = socket.getInputStream();
        final OutputStream output = socket.getOutputStream();

        Thread.sleep(1000);

        output.write(1);

        Thread.sleep(1000);

        try {
            final int read = input.read();
            System.out.println("read = " + read);
        } catch (SocketException e) {
            e.printStackTrace();
        }

        try {
            output.write(1);
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
