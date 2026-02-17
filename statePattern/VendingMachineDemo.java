public class VendingMachineDemo {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();

        machine.selectItem("Soda");
        machine.insertCoin(50);
        machine.dispenseItem();

        machine.selectItem("KitKat");

        machine.insertCoin(20);
        machine.dispenseItem();

        machine.setOutOfOrder();
        machine.selectItem("Chips");
    }
}