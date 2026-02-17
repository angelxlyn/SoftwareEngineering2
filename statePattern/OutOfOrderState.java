public class OutOfOrderState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine, String itemName) {
        System.out.println("Out of Order.");
    }

    @Override
    public void insertCoin(VendingMachine machine, int amount) {
        System.out.println("Out of Order.");
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Out of Order.");
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Already Out of Order.");
    }
}