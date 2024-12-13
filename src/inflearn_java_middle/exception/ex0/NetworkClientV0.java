package inflearn_java_middle.exception.ex0;

public class NetworkClientV0 {
    private final String address;

    public NetworkClientV0(String address) {
        this.address = address;
    }

    public String connect() {
        System.out.println(address + "Server Connect Success");
        return "success";
    }

    public String send(String data) {
        System.out.println(address + "Data send to server " + data);
        return "success";
    }

    public void disconnect() {
        System.out.println(address + " Server disconnect");
    }
}
