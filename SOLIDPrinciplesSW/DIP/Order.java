package DIP;

public class Order {
    private double amount;
    private String paymentMethod;

    public Order(double amount, String paymentMethod) {
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    public double getAmount() {
        return amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }
}