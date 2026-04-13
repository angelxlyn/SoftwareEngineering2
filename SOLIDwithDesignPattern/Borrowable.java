public interface Borrowable extends LibraryResource {
    boolean isAvailable();
    void setAvailable(boolean available);
}