package inflearn_java_advanced02.network.exception.close.normal;

import java.io.*;
import java.net.Socket;

import static inflearn_java_advanced01.util.MyLogger.log;

public class NormalCloseClient {

    public static void main(String[] args) throws IOException {
        final Socket socket = new Socket("localhost", 12345);
        log("소켓 연결: " + socket);
        final InputStream input = socket.getInputStream();
        

        readByDataInputStream(input, socket);

        log("연결 종료: "+ socket.isClosed());
    }

    private static void readByInputStream(InputStream input, Socket socket) throws IOException {
        final int read = input.read();
        log("read = " + read);
        if (read == -1) {
            input.close();
            socket.close();
        }
    }

    private static void readByBufferedReader(InputStream input, Socket socket) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(input));
        final String readString = br.readLine();
        log("readString = "+ readString);
        if (readString == null) {
            br.close();
            socket.close();
        }
    }

    private static void readByDataInputStream(InputStream input, Socket socket) throws IOException {
        final DataInputStream dis = new DataInputStream(input);

        try {
            dis.readUTF();
        } catch (EOFException e) {
            log(e);
        } finally {
            dis.close();
            socket.close();
        }
    }
}
