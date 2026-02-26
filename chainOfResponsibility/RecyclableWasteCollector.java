public class RecyclableWasteCollector implements WasteCollectorChain {
    private WasteCollectorChain nextChain;

    @Override
    public void setNextChain(WasteCollectorChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void collect(WasteContainer container) {
        if ("recyclable".equalsIgnoreCase(container.getWasteType())) {
            if (container.getCurrentLoad() >= container.getCapacity()) {
                System.out.println("Recyclable waste container is full!");
                System.out.println("Collecting recyclable waste...");
                System.out.println("Disposing recyclable waste via recycling process.\n");
                container.empty();
            } else if (container.getCurrentLoad() > 0) {
                System.out.println("Recyclable waste container has waste to collect.");
                System.out.println("Collecting recyclable waste...");
                System.out.println("Disposing recyclable waste via recycling process.\n");
                container.empty();
            } else {
                System.out.println("No recyclable waste to collect.\n");
            }
        } else if (nextChain != null) {
            nextChain.collect(container);
        }
    }
}