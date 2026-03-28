package notification_example;

public class SmsSender implements MessageSender {
    public void sendMessage(String message) {
        System.out.println("SMS: " + message);
    }
}
