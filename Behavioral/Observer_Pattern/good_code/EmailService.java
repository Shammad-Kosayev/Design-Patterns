package good_code;

public class EmailService implements OrderObserver {
    public void onOrderPlaced(String orderId) {
        System.out.println("Sending email for order " + orderId);
    }
}
