package inflearn_java_advanced02.network.tcp.v2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static inflearn_java_advanced02.util.MyLogger.log;

public class ServerV2 {

    private static final int PORT = 12345;

    public static void main(String[] args) throws IOException {
        log("서버 시작");
        final ServerSocket serverSocket = new ServerSocket(PORT);
        log("서버 소켓 시작 - 리스닝 포트: " + PORT);

        final Socket socket = serverSocket.accept();
        log("소켓 연결: " + socket);

        final DataInputStream input = new DataInputStream(socket.getInputStream());
        final DataOutputStream output = new DataOutputStream(socket.getOutputStream());

        while (true) {
            final String received = input.readUTF();
            log("client -> server: "+ received);

            if (received.equals("exit")) {
                break;
            }

            String toSend = received + " World!";
            output.writeUTF(toSend);
            log("client <- server: " + toSend);
        }


        log("연결 종로: " + socket);
        input.close();
        output.close();
        socket.close();
        serverSocket.close();
    }
}
