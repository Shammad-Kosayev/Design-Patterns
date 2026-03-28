package v2;

public class EncryptionDecorator implements NotificationService{
    private final NotificationService notificationService;

    public EncryptionDecorator(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void sendNotification(String notificationMessage) {
        System.out.println("[ENCRYPTED] : " + notificationMessage);
        notificationService.sendNotification(notificationMessage);
    }
}
