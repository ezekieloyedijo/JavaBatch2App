package design_pattern.strategy;

public class PayStack implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of " + amount + " using paystack ");
    }
}
