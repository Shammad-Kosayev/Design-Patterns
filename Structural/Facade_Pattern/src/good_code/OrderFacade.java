package good_code;

public class OrderFacade {

    private InventoryService inventoryService = new InventoryService();
    private PaymentService paymentService = new PaymentService();
    private ShippingService shippingService = new ShippingService();
    private NotificationService notificationService = new NotificationService();

    public void placeOrder(String product, String user) {

        inventoryService.checkStock(product);
        paymentService.processPayment(user);
        shippingService.ship(product);
        notificationService.notifyUser(user);

        System.out.println("Order completed");
    }

}
