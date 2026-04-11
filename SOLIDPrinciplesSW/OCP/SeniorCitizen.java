package OCP;

public class SeniorCitizen implements DiscountStrategy {
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.10;
    }
}