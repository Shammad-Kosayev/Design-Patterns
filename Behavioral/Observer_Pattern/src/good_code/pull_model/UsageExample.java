package good_code.pull_model;

public class UsageExample {
    public static void main(String[] args) {

        OrderService orderService = new OrderService();

        orderService.addObserver(new EmailService());
        orderService.addObserver(new AnalyticsService());
        orderService.addObserver(new WarehouseService());

        orderService.placeOrder("123");
    }
}
