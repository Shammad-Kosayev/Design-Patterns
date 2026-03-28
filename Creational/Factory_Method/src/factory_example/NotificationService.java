package factory_example;

public class NotificationService {

    public void sendNotification(String message) {
        NotificationCreator emailNotificationSenderCreator = new EmailNotificationSenderCreator();
        emailNotificationSenderCreator.sendNotification(message);
    }
}
