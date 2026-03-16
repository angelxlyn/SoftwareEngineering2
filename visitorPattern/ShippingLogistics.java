import java.util.*;

public class ShippingLogistics implements ShippingEvaluator {
    private static Map<String, Double> sizeRateMap = new HashMap<>();

    static {
        sizeRateMap.put("Small", 100.0);
        sizeRateMap.put("Medium", 250.0);
        sizeRateMap.put("Large", 500.0);
    }

    @Override
    public String calculateShipping(String furnitureType, String size) {
        double rate = sizeRateMap.getOrDefault(size, 0.0);
        
        // Specific business logic for bulky types
        if (furnitureType.equalsIgnoreCase("Sofa")) {
            rate += 200.0; 
        }

        return "Shipping cost for " + furnitureType + " (" + size + "): ₱" + rate;
    }
}