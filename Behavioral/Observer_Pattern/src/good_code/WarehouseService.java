package good_code;

public class WarehouseService implements OrderObserver{

    public void onOrderPlaced(String orderId) {
        System.out.println("Notifying warehouse for " + orderId);
    }
}
