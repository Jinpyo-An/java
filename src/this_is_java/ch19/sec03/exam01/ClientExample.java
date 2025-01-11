package this_is_java.ch19.sec03.exam01;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientExample {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 50001);

            System.out.println("Client Connect Successful");

            socket.close();
            System.out.println("Client Connect terminate");
        } catch (UnknownHostException e) {

        } catch (IOException e) {

        }
    }
}
