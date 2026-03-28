package after;

public class NotificationFactory {

    public static Notification createNotification(String type) {
        if (type.equals("EMAIL")) {
            return new EmailNotificationSender();
        }
        if (type.equals("SMS")) {
            return new SmsNotificationSender();
        }
        if (type.equals("PUSH")) {
            return new PushNotificationSender();
        }

        throw new IllegalArgumentException("Invalid Notification type");
    }
}
