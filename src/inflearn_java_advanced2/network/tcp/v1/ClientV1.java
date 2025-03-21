package inflearn_java_advanced2.network.tcp.v1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import static inflearn_java_advanced2.util.MyLogger.log;

public class ClientV1 {

    private static final int PORT = 12345;

    public static void main(String[] args) throws IOException {
        log("클라이언트 시작");
        final Socket socket = new Socket("localhost", PORT);
        final DataInputStream input = new DataInputStream(socket.getInputStream());
        final DataOutputStream output = new DataOutputStream(socket.getOutputStream());
        log("소캣 연결: "+ socket);

        String toSend = "Hello";
        output.writeUTF(toSend);
        log("client -> server: "+ toSend);

        final String received = input.readUTF();
        log("client <- server: " + received);

        log("연결 종료: "+ socket);
        input.close();
        output.close();
        socket.close();
    }
}
