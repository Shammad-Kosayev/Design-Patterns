package v2;

public class LoggingDecorator implements NotificationService{
    private final NotificationService notificationService;

    public LoggingDecorator(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void sendNotification(String notificationMessage) {
        System.out.println("Logging Notification: " + notificationMessage);
        notificationService.sendNotification(notificationMessage);
    }
}
