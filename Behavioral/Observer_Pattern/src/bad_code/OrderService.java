package bad_code;

public class OrderService {

    public void placeOrder() {

        // ❌ tightly coupled logic
        // sendEmail();
        // updateAnalytics();
        // notifyWarehouse();
    }
}
