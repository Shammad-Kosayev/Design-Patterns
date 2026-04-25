package good_code.pull_model;

public class WarehouseService implements OrderObserver {

    public void onOrderPlaced(OrderService orderService) {
        String orderId = orderService.getCurrentOrderId();

        System.out.println("Notifying warehouse for " + orderId);
    }
}