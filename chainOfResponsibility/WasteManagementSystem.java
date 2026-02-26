public class WasteManagementSystem implements WasteCollectorChain {
    private WasteCollectorChain nextChain;

    public WasteManagementSystem() {
        // Initialize the chain
        this.nextChain = new OrganicWasteCollector();
        WasteCollectorChain c2 = new RecyclableWasteCollector();
        WasteCollectorChain c3 = new HazardousWasteCollector();
        
        // Set the chain of responsibility
        nextChain.setNextChain(c2);
        c2.setNextChain(c3);
    }
    
    @Override
    public void collect(WasteContainer container) {
        nextChain.collect(container);
    }

    @Override
    public void setNextChain(WasteCollectorChain nextChain) {
        this.nextChain = nextChain;
    }
}