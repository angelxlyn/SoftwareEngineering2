package DIP;

public class Cash implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("You are paying in Cash.");
    }
}