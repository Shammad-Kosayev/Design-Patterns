package good_code;

import java.util.ArrayList;
import java.util.List;

public class OrderService {

    private List<OrderObserver> observers = new ArrayList<>();

    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    public void placeOrder(String orderId) {
        System.out.println("Order Placed: " + orderId);
        notifyObservers(orderId);
    }

    private void notifyObservers(String orderId) {
        for (OrderObserver observer : observers) {
            observer.onOrderPlaced(orderId);
        }
    }
}
