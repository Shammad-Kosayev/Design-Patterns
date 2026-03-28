public class SMSNotificationService implements NotificationService{

    @Override
    public void sendNotification(String notificationMessage) {
        System.out.println("SMS Notification has been sent with the message " + notificationMessage);
    }
}
