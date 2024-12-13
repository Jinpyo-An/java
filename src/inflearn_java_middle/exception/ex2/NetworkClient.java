package inflearn_java_middle.exception.ex2;

import inflearn_java_middle.exception.ex2.exception.ConnectException;
import inflearn_java_middle.exception.ex2.exception.SendException;

public class NetworkClient implements AutoCloseable {
    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClient(String address) {
        this.address = address;
    }

    public void connect() {
        if (connectError) {
            throw new ConnectException(address, address + ", 서버 연결 실패");
        }
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) {
        if (sendError) {
            throw new SendException(data, address + " 서버에 데이터 전송 실패: " + data);
        }
        System.out.println(address + " 서버에 데이터 전송: " + data);
    }

    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String data) {
        if (data.contains("error1"))
            connectError = true;
        if (data.contains("error2"))
            sendError = true;
    }

    @Override
    public void close() {
        System.out.println("NetworkClient.close");
        disconnect();
    }
}
