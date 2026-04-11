package OCP;

public class Regular implements DiscountStrategy {
    @Override
    public double calculateDiscount(double amount) {
        return 0.0;
    }
}