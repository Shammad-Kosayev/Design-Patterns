package good_code;

public class AnalyticsService implements OrderObserver{

    public void onOrderPlaced(String orderId) {
        System.out.println("Updating analytics for " + orderId);
    }
}
