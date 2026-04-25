package good_code.push_model;

public interface OrderObserver {
    void onOrderPlaced(String orderId);
}
