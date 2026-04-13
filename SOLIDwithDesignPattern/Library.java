import java.util.*;

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
                String borrowableStatus = (resource instanceof Borrowable) ? 
                    ( ((Borrowable)resource).isAvailable() ? "✓ Available" : "✗ Checked Out") : 
                    "Reference Only";
                System.out.println("[" + resource.getResourceType() + "] " + resource.getTitle() + 
                    " - " + borrowableStatus);
            }
        }
        System.out.println();
    }
    
    public List<LibraryResource> getResourcesByType(String type) {
        List<LibraryResource> result = new ArrayList<>();
        for (LibraryResource resource : resources) {
            if (resource.getResourceType().equalsIgnoreCase(type)) {
                result.add(resource);
            }
        }
        return result;
    }
    
    public List<LibraryResource> getAvailableBorrowableResources() {
        List<LibraryResource> result = new ArrayList<>();
        for (LibraryResource resource : resources) {
            if (resource instanceof Borrowable) {
                Borrowable borrowable = (Borrowable) resource;
                if (borrowable.isAvailable()) {
                    result.add(resource);
                }
            }
        }
        return result;
    }
    
    public List<LibraryResource> getResources() {
        return resources;
    }
}