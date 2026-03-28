package v2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        NotificationService service =
                new EmailNotificationService();

        service = new LoggingDecorator(service);
        service = new EncryptionDecorator(service);

        service.sendNotification("SALAM!!");
    }
}