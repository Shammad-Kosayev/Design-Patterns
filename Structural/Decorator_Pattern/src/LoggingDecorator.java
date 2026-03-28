public class LoggingDecorator extends NotificationDecorator{

    public LoggingDecorator(NotificationService notificationService) {
        super(notificationService);
    }

    public void sendNotification(String notificationMessage) {
        System.out.println("Logging Notification: " + notificationMessage);
        super.sendNotification(notificationMessage);
    }
}
