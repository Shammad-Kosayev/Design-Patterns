import good_code.AnalyticsService;
import good_code.EmailService;
import good_code.OrderService;
import good_code.WarehouseService;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        OrderService orderService = new OrderService();

        orderService.addObserver(new EmailService());
        orderService.addObserver(new AnalyticsService());
        orderService.addObserver(new WarehouseService());

        orderService.placeOrder("123");
    }
}