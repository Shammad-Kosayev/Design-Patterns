package good_code.push_model;

public class WarehouseService implements OrderObserver{

    public void onOrderPlaced(String orderId) {
        System.out.println("Notifying warehouse for " + orderId);
    }
}
