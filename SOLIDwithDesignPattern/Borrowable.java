public interface Borrowable {
    void borrow();
    void return_();
    boolean isAvailable();
    void setAvailable(boolean available);
}