package bad_code.EVEN_WORSE;

public class PaymentService {

    public void pay(String type, String provider, double amount) {

        if (type.equals("ONE_TIME") && provider.equals("STRIPE")) {
            System.out.println("One-time Stripe: " + amount);

        } else if (type.equals("ONE_TIME") && provider.equals("PAYPAL")) {
            System.out.println("One-time PayPal: " + amount);

        } else if (type.equals("SUBSCRIPTION") && provider.equals("STRIPE")) {
            System.out.println("Subscription Stripe: " + amount);

        } else if (type.equals("SUBSCRIPTION") && provider.equals("PAYPAL")) {
            System.out.println("Subscription PayPal: " + amount);
        }
    }
}
/*
🔴 This Is Worse Because
❌ giant if-else
❌ impossible to scale
❌ violates Open/Closed
❌ unreadable quickly
*/

