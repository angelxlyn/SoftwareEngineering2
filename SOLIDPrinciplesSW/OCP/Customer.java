package OCP;

public class Customer {
    private String name;
    private DiscountStrategy discountStrategy;

    public Customer(String name, DiscountStrategy discountStrategy) {
        this.name = name;
        this.discountStrategy = discountStrategy;
    }

    public String getName() {
        return name;
    }

    public double calculateDiscount(double amount) {
        return discountStrategy.calculateDiscount(amount);
    }

    public double applyDiscount(double amount) {
        return amount - calculateDiscount(amount);
    }
}