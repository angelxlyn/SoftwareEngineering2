public interface WasteCollectorChain {
    void setNextChain(WasteCollectorChain nextChain);
    void collect(WasteContainer container);
}