package inflearn_java_advanced02.network.exception.close.normal;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static inflearn_java_advanced01.util.MyLogger.log;

public class NormalCloseServer {

    public static void main(String[] args) throws InterruptedException, IOException {
        final ServerSocket serverSocket = new ServerSocket(12345);
        final Socket socket = serverSocket.accept();
        log("소켓 연결: " + socket);

        Thread.sleep(1000);
        socket.close();
        log("소켓 종료");
    }
}
