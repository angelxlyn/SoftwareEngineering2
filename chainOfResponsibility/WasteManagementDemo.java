public class WasteManagementDemo {
    public static void main(String[] args) {
        WasteManagementSystem wasteManagement = new WasteManagementSystem();

        WasteContainer organicContainer = new WasteContainer("organic", 20);
        WasteContainer recyclableContainer = new WasteContainer("recyclable", 20);
        WasteContainer hazardousContainer = new WasteContainer("hazardous", 10);
        
        organicContainer.addWaste(25);
        wasteManagement.collect(organicContainer);
        
        recyclableContainer.addWaste(15);
        wasteManagement.collect(recyclableContainer);

        hazardousContainer.addWaste(5);
        wasteManagement.collect(hazardousContainer);

        wasteManagement.collect(organicContainer);
    }
}