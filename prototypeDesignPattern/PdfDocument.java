public class PdfDocument implements Document {
    private String fileName;
    private String author;
    private int pageCount;

    public PdfDocument() {
        this.fileName = "default.pdf";
        this.author = "Unknown";
        this.pageCount = 0;
    }

    public PdfDocument(String fileName, String author, int pageCount) {
        this.fileName = fileName;
        this.author = author;
        this.pageCount = pageCount;
    }

    public void setFileName(String fileName) { this.fileName = fileName; }
    public void setAuthor(String author) { this.author = author; }
    public void setPageCount(int pageCount) { this.pageCount = pageCount; }
    public String getFileName() { return fileName; }
    public String getAuthor() { return author; }
    public int getPageCount() { return pageCount; }

    @Override
    public PdfDocument clone() {
        return new PdfDocument(this.fileName, this.author, this.pageCount);
    }

    @Override
    public void open() {
        System.out.println("\nOpening PDF Document: " + fileName + " by " + author + " (" + pageCount + " pages)");
        System.out.println("Type: PDF, File: " + fileName + ", Author: " + author + ", Pages: " + pageCount);
    }

    @Override
    public String getType() {
        return "PDF";
    }
}