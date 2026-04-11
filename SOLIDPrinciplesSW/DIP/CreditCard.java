package DIP;

public class CreditCard implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("You are paying using Credit Card.");
    }
}