package this_is_java.ch19.sec03.exam01;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerExample {
    private static ServerSocket serverSocket = null;

    public static void main(String[] args) {
        startServer();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String key = scanner.nextLine();
            if (key.toLowerCase().equals("q")) break;
        }

        scanner.close();

        stopServer();
    }

    private static void stopServer() {
        try {
            serverSocket.close();
            System.out.println("Server terminate");
        } catch (IOException e) {

        }
    }

    private static void startServer() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    serverSocket = new ServerSocket(50001);
                    System.out.println("Server Start");

                    while (true) {
                        System.out.println("서버 연결 요청 기다림");
                        Socket socket = serverSocket.accept();

                        InetSocketAddress isa =
                                (InetSocketAddress) socket.getRemoteSocketAddress();
                        System.out.println("Server: " + isa.getHostName() + "connect okay");

                        socket.close();
                        System.out.println("Server: " + isa.getHostName() + "disconnect");
                    }
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        };
        thread.start();
    }


}
