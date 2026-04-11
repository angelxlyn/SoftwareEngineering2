package OCP;

public class Student implements DiscountStrategy {
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.05;
    }
}