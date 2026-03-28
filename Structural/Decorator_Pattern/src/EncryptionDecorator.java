public class EncryptionDecorator extends NotificationDecorator{

    public EncryptionDecorator(NotificationService notificationService) {
        super(notificationService);
    }

    public void sendNotification(String notificationMessage) {
        System.out.println("[ENCRYPTED] : " + notificationMessage);
        super.sendNotification(notificationMessage);
    }
}
