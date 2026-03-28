package v2;

public class EmailNotificationService implements NotificationService {

    @Override
    public void sendNotification(String notificationMessage) {
        System.out.println("Email Notification has been sent with message: " + notificationMessage);
    }
}
