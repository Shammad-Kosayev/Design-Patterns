package notification_example;

public class NormalNotification extends Notification {

    public NormalNotification(MessageSender sender) {
        super(sender);
    }

    public void send(String message) {
        sender.sendMessage(message);
    }
}
