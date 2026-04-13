import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    private List<LibraryResource> resources;
    
    public Library(String name) {
        this.name = name;
        this.resources = new ArrayList<>();
    }
    
    public void addResource(LibraryResource resource) {
        resources.add(resource);
        System.out.println("Added to library: " + resource.getResourceType() + " - " + resource.getTitle());
    }
    
    public void removeResource(LibraryResource resource) {
        resources.remove(resource);
        System.out.println("Removed from library: " + resource.getTitle());
    }
    
    public void displayAllResources() {
        System.out.println("\n=== " + name + " Resources ===");
        if (resources.isEmpty()) {
            System.out.println("No resources available.");
        } else {
            for (LibraryResource resource : resources) {
                String status;
                if (resource instanceof Borrowable) {
                    status = ((Borrowable)resource).isAvailable() ? "✓ Available" : "✗ Checked Out";
                } else {
                    status = "Reference Only";
                }
                System.out.println("[" + resource.getResourceType() + "] " + resource.getTitle() + " - " + status);
            }
        }
        System.out.println();
    }
    
    public List<LibraryResource> getResources() {
        return resources;
    }
}