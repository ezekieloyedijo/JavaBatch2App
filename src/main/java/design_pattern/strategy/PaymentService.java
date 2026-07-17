package design_pattern.strategy;

// PayStack - 1
// Flutterwave - 2
public class PaymentService {
    PaymentGateway paymentGateway;

    public PaymentService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }
    public void pay(){
        paymentGateway.processPayment(200);
    }
}
