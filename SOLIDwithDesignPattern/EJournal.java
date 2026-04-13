public class EJournal implements LibraryResource {
    private String title;
    private String url;
    
    public EJournal(String title, String url) {
        this.title = title;
        this.url = url;
    }
    
    @Override
    public String getTitle() { return title; }
    
    @Override
    public String getResourceType() { return "E-Journal"; }
    
    @Override
    public void borrow() {
        System.out.println("Online access granted: " + url);
    }
    
    @Override
    public void return_() {
        System.out.println("Access closed");
    }
}