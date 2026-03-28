package factory_example;

public class EmailNotificationSenderCreator extends NotificationCreator {

    protected Notification createNotification() {
        return new EmailNotificationSender();
    }
}
