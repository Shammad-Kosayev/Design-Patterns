package bad_code;

public class OrderController {

    private InventoryService inventoryService;
    private PaymentService paymentService;
    private ShippingService shippingService;
    private NotificationService notificationService;

    public void placeOrder(String product, String user) {

        inventoryService.checkStock(product);
        paymentService.processPayment(user);
        shippingService.ship(product);
        notificationService.notifyUser(user);

        System.out.println("Order completed");
    }

}
