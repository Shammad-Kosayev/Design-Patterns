package good_code.pull_model;

public class EmailService implements OrderObserver {

    public void onOrderPlaced(OrderService orderService) {
        String orderId = orderService.getCurrentOrderId();

        System.out.println("Sending email for order " + orderId);
    }
}