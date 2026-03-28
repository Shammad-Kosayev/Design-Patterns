package after;

public class SmsNotificationSender implements Notification {

    public void send(String message) {
        System.out.println("SMS has been sent! the message is:  " + message);
    }
}
