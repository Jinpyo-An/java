package this_is_java.ch15.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        Queue<Message> messageQueue = new LinkedList<>();

        messageQueue.offer(new Message("sendMail", "홍길동"));
        messageQueue.offer(new Message("sendSMS", "신용권"));
        messageQueue.offer(new Message("sendKakaotalk", "감자바"));

        while (!messageQueue.isEmpty()) {
            Message message = messageQueue.poll();
            System.out.println(message.command + " " + message.to);
        }
    }
}
