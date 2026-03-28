package after;

public class EmailNotificationSender implements Notification {

    public void send(String message) {
        System.out.println("Email has been sent! the message is:  " + message);
    }
}
