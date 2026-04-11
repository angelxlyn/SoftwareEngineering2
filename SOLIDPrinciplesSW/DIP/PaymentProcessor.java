package DIP;

public class PaymentProcessor {
    private PaymentStrategy strategy;

    public PaymentProcessor(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void processPayment(Order order) {
        strategy.pay(order.getAmount());
    }
}