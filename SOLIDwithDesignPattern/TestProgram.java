public class TestProgram {
    public static void main(String[] args) {
        Student student = new Student("John Doe");

        // Create resources
        LibraryResource book = new Book("Clean Code");
        LibraryResource thesis = new Thesis("AI in Healthcare");
        LibraryResource capstone = new Capstone("Blockchain Application");
        LibraryResource journal = new Journal("Nature");
        LibraryResource newspaper = new Newspaper("Daily Times");
        LibraryResource internet = new InternetAccess("WiFi");
        LibraryResource audioBook = new AudioBook("The Pragmatic Programmer");
        LibraryResource ejournal = new EJournal("Digital Trends", "https://digitaltrends.com");
        
        student.borrowResource(book);
        student.borrowResource(thesis);
        student.borrowResource(capstone);
        student.borrowResource(journal);
        student.borrowResource(newspaper);
        student.borrowResource(internet);
        student.borrowResource(audioBook);
        student.borrowResource(ejournal);
        
        student.returnResource(book);
        student.returnResource(thesis);
        student.returnResource(capstone);
        student.returnResource(audioBook);
    }
}