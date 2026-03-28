package before;

import after.Notification;
import after.NotificationFactory;

public class NotificationService {

    public void send(String type, String message) {
        Notification notificationSender = NotificationFactory.createNotification(type);
        notificationSender.send(message);
    }
}
