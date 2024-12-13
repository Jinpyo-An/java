package inflearn_java_middle.exception.ex2.exception;

public class ConnectException extends NetworkClientException {
    private final String address;

    public ConnectException(String address ,String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
