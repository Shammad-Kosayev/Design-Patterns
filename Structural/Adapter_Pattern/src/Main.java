public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Service serviceWithPaypalProcessor = new Service(new PayPalAdapter(new PayPalAPI()));
        Service serviceWithLocalProcessor = new Service(new LocalPaymentProcessor());

        serviceWithLocalProcessor.payForItem(10);
        serviceWithPaypalProcessor.payForItem(20);

    }
}