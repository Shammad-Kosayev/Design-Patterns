package good_code.pull_model;

public interface OrderObserver {
    void onOrderPlaced(OrderService orderService);
}
