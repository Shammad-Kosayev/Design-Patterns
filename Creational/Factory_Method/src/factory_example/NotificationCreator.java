package factory_example;

public abstract class NotificationCreator {

    public void sendNotification(String message) {
        Notification notification = createNotification();
        notification.send(message);
    }

    protected abstract Notification createNotification();
}
