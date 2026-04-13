public class Journal implements LibraryResource, Borrowable {
    private String title;
    private boolean available;
    
    public Journal(String title) {
        this.title = title;
        this.available = true;
    }
    
    @Override
    public String getTitle() { return title; }
    
    @Override
    public String getResourceType() { return "Journal"; }
    
    @Override
    public void borrow() {
        if (available) {
            available = false;
            System.out.println("Successfully borrowed");
        } else {
            System.out.println("Not available");
        }
    }
    
    @Override
    public void return_() {
        available = true;
        System.out.println("Successfully returned");
    }
    
    @Override
    public boolean isAvailable() { return available; }
    
    @Override
    public void setAvailable(boolean available) { this.available = available; }
}