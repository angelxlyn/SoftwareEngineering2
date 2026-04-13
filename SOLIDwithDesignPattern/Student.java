public class Student {
    private String name;
    
    public Student(String name) {
        this.name = name;
    }
    
    public void borrowResource(LibraryResource resource) {
        System.out.println(name + " is borrowing " + resource.getResourceType() + ": " + resource.getTitle());
        resource.borrow();
        System.out.println();
    }
    
    public void returnResource(LibraryResource resource) {
        System.out.println(name + " is returning " + resource.getResourceType() + ": " + resource.getTitle());
        resource.return_();
        System.out.println();
    }
    
    public String getName() { return name; }
}