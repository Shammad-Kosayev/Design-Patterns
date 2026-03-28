package good_code;

import bad_code.InventoryService;
import bad_code.NotificationService;
import bad_code.PaymentService;
import bad_code.ShippingService;

public class OrderController {

    private OrderFacade orderFacade = new OrderFacade();

    public void placeOrder(String product, String user) {
        orderFacade.placeOrder(product, user);
    }

}
