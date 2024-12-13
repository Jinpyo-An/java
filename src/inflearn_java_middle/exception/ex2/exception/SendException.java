package inflearn_java_middle.exception.ex2.exception;

public class SendException extends  NetworkClientException {
    private final String sendData;

    public SendException(String sendData, String message) {
        super(message);
        this.sendData = sendData;
    }

    public String getSendData() {
        return sendData;
    }
}
