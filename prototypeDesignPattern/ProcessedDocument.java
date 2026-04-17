public class ProcessedDocument {
    public static void main(String[] args) {
        DocumentRegistry registry = new DocumentRegistry();

        PdfDocument pdf1 = (PdfDocument) registry.getPdfClone();
        pdf1.setFileName("annual_report_2024.pdf");
        pdf1.setAuthor("Acme Corp");
        pdf1.setPageCount(150);
        pdf1.open();

        TextDocument text = (TextDocument) registry.getTextClone();
        text.setFilePath("meeting_notes.txt");
        text.setEncoding("UTF-8");
        text.setWordCount(250);
        text.open();

        SpreadsheetDocument sheet = (SpreadsheetDocument) registry.getSpreadsheetClone();
        sheet.setSpreadsheetName("sales_data_q1.xlsx");
        sheet.setRowCount(1000);
        sheet.setColumnCount(20);
        sheet.open();

        PdfDocument pdf2 = (PdfDocument) registry.getPdfClone();
        pdf2.setFileName("summary_report.pdf");
        pdf2.setAuthor("Acme Corp");
        pdf2.setPageCount(30);
        System.out.println("Opening PDF Document: " + pdf2.getFileName() + " by " + pdf2.getAuthor() + " (" + pdf2.getPageCount() + " pages)");
    }
}