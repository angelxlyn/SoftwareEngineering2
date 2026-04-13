public class Newspaper implements LibraryResource {
    private String title;
    
    public Newspaper(String title) {
        this.title = title;
    }
    
    @Override
    public String getTitle() { return title; }
    
    @Override
    public String getResourceType() { return "Newspaper"; }
    
    @Override
    public void borrow() {
        System.out.println("Newspapers cannot be borrowed");
    }
    
    @Override
    public void return_() {
        System.out.println("No return needed for newspapers");
    }
}