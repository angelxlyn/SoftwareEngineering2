public class ECommerceApp {
    public static void main(String[] args) {
        Furniture chair = new Furniture("Chair", "Small");
        Furniture table = new Furniture("Table", "Medium");
        Furniture sofa = new Furniture("Sofa", "Large");

        ShippingEvaluator shippingLogistics = new ShippingLogistics();

        System.out.println(chair.accept(shippingLogistics, chair.getSize()));
        System.out.println(table.accept(shippingLogistics, table.getSize()));
        System.out.println(sofa.accept(shippingLogistics, sofa.getSize()));
    }
}