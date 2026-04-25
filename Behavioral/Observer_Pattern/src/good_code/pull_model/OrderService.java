package good_code.pull_model;

import java.util.ArrayList;
import java.util.List;

public class OrderService {

    private List<OrderObserver> observers = new ArrayList<>();

    private String currentOrderId;

    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    public void placeOrder(String orderId) {
        this.currentOrderId = orderId;

        System.out.println("Order Placed: " + orderId);

        notifyObservers();
    }

    private void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.onOrderPlaced(this);
        }
    }

    // 🔥 Observers PULL data from here
    public String getCurrentOrderId() {
        return currentOrderId;
    }
}