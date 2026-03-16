public class Furniture implements FurnitureItem {
    private String furnitureType;
    private String size;

    public Furniture(String furnitureType, String size) {
        this.furnitureType = furnitureType;
        this.size = size;
    }

    @Override
    public String accept(ShippingEvaluator evaluator, String size) {
        this.size = size;
        return evaluator.calculateShipping(this.furnitureType, size);
    }

    public String getFurnitureType() {
        return furnitureType;
    }

    public String getSize() {
        return size;
    }
}