package notification_example;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        MessageSender emailSender = new EmailSender();

        Notification notification =
                new UrgentNotification(emailSender);

        notification.send("Server is down!");
    }
}
