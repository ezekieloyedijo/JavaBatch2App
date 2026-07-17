package design_pattern.strategy;

public class Flutterwave implements PaymentGateway{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of " + amount + "using flutterwave");
    }
}
