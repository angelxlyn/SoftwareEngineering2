public class ProcessedDocument {
    public static void main(String[] args) {
        DocumentRegistry registry = new DocumentRegistry();

        Document pdf1 = registry.createPdfDocument("annual_report_2024.pdf", "Acme Corp", 150);
        pdf1.open();

        Document text = registry.createTextDocument("meeting_notes.txt", "UTF-8", 250);
        text.open();

        Document sheet = registry.createSpreadsheetDocument("sales_data_q1.xlsx", 1000, 20);
        sheet.open();

        Document pdf2 = registry.createPdfDocument("summary_report.pdf", "Acme Corp", 30);
        pdf2.open();
    }
}
