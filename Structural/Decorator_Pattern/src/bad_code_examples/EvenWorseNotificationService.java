class NotificationService {

//some people write code like this in real life

    public void sendEmailAndSms(String msg) {
        sendEmail(msg);
        sendSms(msg);
    }

    public void sendEmailAndPush(String msg) {
        sendEmail(msg);
        sendPush(msg);
    }

    public void sendSmsAndPush(String msg) {
        sendSms(msg);
        sendPush(msg);
    }

    public void sendAll(String msg) {
        sendEmail(msg);
        sendSms(msg);
        sendPush(msg);
    }

    // base methods...
}