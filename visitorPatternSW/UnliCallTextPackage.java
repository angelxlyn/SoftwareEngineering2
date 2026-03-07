import java.util.*;

public class UnliCallTextPackage implements UnliCallsTextOffer {
    private static Map<String, String> unliMap = new HashMap<>();

    static {
        unliMap.put("Globe", "Same network only. Other networks are charged extra.");
        unliMap.put("Dito", "All networks within the country.");
    }

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        if (!unliCallText) {
            return "No unlimited offer.";
        } else {
            return unliMap.getOrDefault(telcoName, "Unlimited offer available.");
        }
    }
}