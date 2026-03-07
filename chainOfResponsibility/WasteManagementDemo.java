public class WasteManagementDemo {
    public static void main(String[] args) {
        WasteManagementSystem wasteManagement = new WasteManagementSystem();

        WasteContainer organic = new WasteContainer("organic", 20);
        WasteContainer recyclable = new WasteContainer("recyclable", 20);
        WasteContainer hazardous = new WasteContainer("hazardous", 10);
        
        organic.addWaste(25);
        wasteManagement.collect(organic);
        
        recyclable.addWaste(15);
        wasteManagement.collect(recyclable);

        hazardous.addWaste(5);
        wasteManagement.collect(hazardous);

        wasteManagement.collect(organic);
    }
}