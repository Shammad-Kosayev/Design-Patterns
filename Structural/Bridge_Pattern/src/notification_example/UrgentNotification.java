package notification_example;

public class UrgentNotification extends Notification {

    public UrgentNotification(MessageSender sender) {
        super(sender);
    }

    public void send(String message) {
        sender.sendMessage("URGENT: " + message);
    }
}
