public class VendingMachine {
    private VendingMachineState currentState;
    private String[] items = {"Soda", "Chips"};
    private int[] stock = {20, 15};
    private int balance;
    private String selectedItem;

    public VendingMachine() {
        this.balance = 0;
        this.currentState = new IdleState();
    }

    public void selectItem(String name) {
        currentState.selectItem(this, name);
    }

    public void insertCoin(int amount) {
        currentState.insertCoin(this, amount);
    }

    public void dispenseItem() {
        currentState.dispenseItem(this);
    }

    public void setOutOfOrder() {
        currentState.setOutOfOrder(this);
    }

    public void setState(VendingMachineState state) {
        this.currentState = state;
    }

    public VendingMachineState getState() {
        return currentState;
    }

    public String[] getItems() {
        return items;
    }
    
    public int[] getStock() {
        return stock;
    }
    
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    public String getSelectedItem() {
        return selectedItem;
    }
    
    public void setSelectedItem(String item) {
        this.selectedItem = item;
    }
}