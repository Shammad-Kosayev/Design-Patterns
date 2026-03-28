package notification_example;

public class EmailSender implements MessageSender {
    public void sendMessage(String message) {
        System.out.println("Email: " + message);
    }
}
