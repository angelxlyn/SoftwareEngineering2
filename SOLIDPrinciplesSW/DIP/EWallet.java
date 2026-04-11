package DIP;

public class EWallet implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("You are paying in GCash.");
    }
}