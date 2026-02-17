public class IdleState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine, String itemName) {
        String[] items = machine.getItems();
        int[] stock = machine.getStock();
        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase(itemName)) {
                if (stock[i] > 0) {
                    machine.setSelectedItem(items[i]);
                    System.out.println("Selected: " + items[i]);
                    machine.setState(new ItemSelectedState());
                } else {
                    System.out.println("Out of stock.");
                }
                return;
            }
        }
        System.out.println("Item not found.");
    }

    @Override
    public void insertCoin(VendingMachine machine, int amount) {
        System.out.println("Select an item first.");
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("No item selected to dispense.");
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        machine.setState(new OutOfOrderState());
    }
}