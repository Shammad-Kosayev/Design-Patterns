package after;

public class PushNotificationSender implements Notification {

    public void send(String message) {
        System.out.println("Push notification has been sent! the message is:  " + message);
    }
}
