public abstract class NotificationDecorator implements NotificationService {
    protected final NotificationService notificationService;

    public NotificationDecorator(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @Override
    public void sendNotification(String notificationMessage) {
        notificationService.sendNotification(notificationMessage);
    }
}
