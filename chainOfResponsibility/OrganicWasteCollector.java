public class OrganicWasteCollector implements WasteCollectorChain {
    private WasteCollectorChain nextChain;

    @Override
    public void setNextChain(WasteCollectorChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void collect(WasteContainer container) {
        if ("organic".equalsIgnoreCase(container.getWasteType())) {
            if (container.getCurrentLoad() >= container.getCapacity()) {
                System.out.println("Organic waste container is full!");
                System.out.println("Collecting organic waste...");
                System.out.println("Disposing organic waste via composting.\n");
                container.empty();
            } else if (container.getCurrentLoad() > 0) {
                System.out.println("Organic waste container has waste to collect.");
                System.out.println("Collecting organic waste...");
                System.out.println("Disposing organic waste via composting.\n");
                container.empty();
            } else {
                System.out.println("No organic waste to collect.\n");
            }
        } else if (nextChain != null) {
            nextChain.collect(container);
        }
    }
}