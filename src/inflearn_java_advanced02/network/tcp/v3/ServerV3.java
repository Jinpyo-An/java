package inflearn_java_advanced02.network.tcp.v3;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static inflearn_java_advanced02.util.MyLogger.log;

public class ServerV3 {

    private static final int PORT = 12345;

    public static void main(String[] args) throws IOException {
        log("서버 시작");
        final ServerSocket serverSocket = new ServerSocket(PORT);
        log("서버 소켓 시작 - 리스닝 포트: " + PORT);

        while (true) {
            final Socket socket = serverSocket.accept();
            log("소켓 연결: "+ socket);

            final SessionV3 session = new SessionV3(socket);
            final Thread thread = new Thread(session);
            thread.start();
        }
    }
}
