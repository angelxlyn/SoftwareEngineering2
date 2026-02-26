public class WasteContainer {
    private String wasteType;
    private int capacity;
    private int currentLoad;

    public WasteContainer(String wasteType, int capacity) {
        this.wasteType = wasteType;
        this.capacity = capacity;
        this.currentLoad = 0;
    }

    public String getWasteType() {
        return wasteType;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCurrentLoad() {
        return currentLoad;
    }

    public void addWaste(int amount) {
        currentLoad += amount;
        System.out.println(amount + "kg added to " + wasteType + " container.");
    }

    public void empty() {
        currentLoad = 0;
    }
}