public class OrderTest {
    public static void main(String[] args) {
        OrderAction order = new OrderAction(
            new BasicOrderCalculator(),
            new StandardOrderPlacer(),
            new PdfInvoiceGenerator(),
            new EmailNotificationService()
        );

        order.processOrder(
            10.0, 2,
            "John Doe", "123 Main St",
            "order_123.pdf",
            "johndoe@example.com"
        );
    }
}