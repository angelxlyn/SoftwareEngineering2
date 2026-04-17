public class DocumentRegistry {
    private PdfDocument pdfPrototype;
    private TextDocument textDocumentPrototype;
    private SpreadsheetDocument spreadsheetPrototype;

    public DocumentRegistry() {
        pdfPrototype = new PdfDocument();
        textDocumentPrototype = new TextDocument();
        spreadsheetPrototype = new SpreadsheetDocument();
        System.out.println("Creating a PDF Document prototype.");
        System.out.println("Creating a Text Document prototype.");
        System.out.println("Creating a Spreadsheet Document prototype.");
    }

    public Document getPdfClone() {
        return pdfPrototype.clone();
    }

    public Document getTextClone() {
        return textDocumentPrototype.clone();
    }

    public Document getSpreadsheetClone() {
        return spreadsheetPrototype.clone();
    }
}