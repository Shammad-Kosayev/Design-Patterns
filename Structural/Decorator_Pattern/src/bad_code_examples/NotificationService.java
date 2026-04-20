class NotificationService {

    public void send(String type, String message) {

        if (type.equals("EMAIL")) {
            sendEmail(message);

        } else if (type.equals("SMS")) {
            sendSms(message);

        } else if (type.equals("PUSH")) {
            sendPush(message);

        } else if (type.equals("EMAIL_SMS")) {
            sendEmail(message);
            sendSms(message);

        } else if (type.equals("EMAIL_PUSH")) {
            sendEmail(message);
            sendPush(message);

        } else if (type.equals("SMS_PUSH")) {
            sendSms(message);
            sendPush(message);

        } else if (type.equals("ALL")) {
            sendEmail(message);
            sendSms(message);
            sendPush(message);
        }
    }

    private void sendEmail(String message) {
        System.out.println("Sending EMAIL: " + message);
    }

    private void sendSms(String message) {
        System.out.println("Sending SMS: " + message);
    }

    private void sendPush(String message) {
        System.out.println("Sending PUSH: " + message);
    }
}