public class HazardousWasteCollector implements WasteCollectorChain {
    private WasteCollectorChain nextChain;

    @Override
    public void setNextChain(WasteCollectorChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void collect(WasteContainer container) {
        if ("hazardous".equalsIgnoreCase(container.getWasteType())) {
            if (container.getCurrentLoad() >= container.getCapacity()) {
                System.out.println("Hazardous waste container is full!");
                System.out.println("Collecting hazardous waste...");
                System.out.println("Disposing hazardous waste via special handling process.\n");
                container.empty();
            } else if (container.getCurrentLoad() > 0) {
                System.out.println("Hazardous waste container has waste to collect.");
                System.out.println("Collecting hazardous waste...");
                System.out.println("Disposing hazardous waste via special handling process.\n");
                container.empty();
            } else {
                System.out.println("No hazardous waste to collect.\n");
            }
        } else if (nextChain != null) {
            nextChain.collect(container);
        }
    }
}