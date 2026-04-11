public class OrderAction {
    private final OrderCalculator calculator;
    private final OrderPlacer placer;
    private final InvoiceGenerator invoiceGenerator;
    private final NotificationService notificationService;

    public OrderAction(OrderCalculator calculator, OrderPlacer placer, InvoiceGenerator invoiceGenerator, NotificationService notificationService) {
        this.calculator = calculator;
        this.placer = placer;
        this.invoiceGenerator = invoiceGenerator;
        this.notificationService = notificationService;
    }

    public void processOrder(double price, int quantity, String customerName, String address, String fileName, String email) {
        calculator.calculateTotal(price, quantity);
        placer.placeOrder(customerName, address);
        invoiceGenerator.generateInvoice(fileName);
        notificationService.sendEmailNotification(email);
    }

    public void processOrder(double price, int quantity, String customerName, String address) {
        calculator.calculateTotal(price, quantity);
        placer.placeOrder(customerName, address);
    }
}