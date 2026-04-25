package good_code.pull_model;

public class AnalyticsService implements OrderObserver {

    public void onOrderPlaced(OrderService orderService) {
        String orderId = orderService.getCurrentOrderId();

        System.out.println("Updating analytics for " + orderId);
    }
}