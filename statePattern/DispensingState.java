public class DispensingState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine, String itemName) {
        System.out.println("Please wait, currently dispensing.");
    }

    @Override
    public void insertCoin(VendingMachine machine, int amount) {
        System.out.println("Please wait, currently dispensing.");
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        String[] items = machine.getItems();
        int[] stock = machine.getStock();
        String selectedItem = machine.getSelectedItem();

        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase(selectedItem)) {
                stock[i]--;
                break;
            }
        }

        System.out.println("Dispensing " + selectedItem + "...");
        machine.setBalance(0);
        machine.setSelectedItem(null);
        machine.setState(new IdleState());
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        machine.setState(new OutOfOrderState());
    }
}