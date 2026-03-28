package factory_example;

public class SmsNotificationSenderCreator extends NotificationCreator {

    protected Notification createNotification() {
        return new SmsNotificationSender();
    }
}
