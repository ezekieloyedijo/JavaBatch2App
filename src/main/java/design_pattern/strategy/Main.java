package design_pattern.strategy;

public class Main {
    public static void main(String[] args) {
        PayStack payStack = new PayStack();
        Flutterwave flutterwave = new Flutterwave();
        PaymentService paymentService = new PaymentService(flutterwave);
        paymentService.pay();
    }
}
