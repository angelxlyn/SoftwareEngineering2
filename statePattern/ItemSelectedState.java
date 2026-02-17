public class ItemSelectedState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine, String itemName) {
        System.out.println(machine.getSelectedItem() + " already selected. Please insert coins.");
    }

    @Override
    public void insertCoin(VendingMachine machine, int amount) {
        machine.setBalance(machine.getBalance() + amount); 
        System.out.println("Coin inserted. Balance: " + machine.getBalance());
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        machine.setState(new DispensingState());
        machine.getState().dispenseItem(machine);
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        machine.setState(new OutOfOrderState());
    }
}