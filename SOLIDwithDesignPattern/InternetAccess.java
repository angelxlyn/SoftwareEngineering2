public class InternetAccess implements LibraryResource {
    private String title;
    
    public InternetAccess(String title) {
        this.title = title;
    }
    
    @Override
    public String getTitle() { return title; }
    
    @Override
    public String getResourceType() { return "InternetAccess"; }
    
    @Override
    public void borrow() {
        System.out.println("Available for in-library use only");
    }
    
    @Override
    public void return_() {
        System.out.println("Session ended");
    }
}