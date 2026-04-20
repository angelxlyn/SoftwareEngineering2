public class DocumentRegistry {
    private PdfDocument pdfPrototype = new PdfDocument("", "", 0);
    private TextDocument textPrototype = new TextDocument("", "", 0);
    private SpreadsheetDocument spreadsheetPrototype = new SpreadsheetDocument("", 0, 0);

    public Document createPdfDocument(String fileName, String author, int pageCount) {
        PdfDocument newPdf = pdfPrototype.clone();
        newPdf.setFileName(fileName);
        newPdf.setAuthor(author);
        newPdf.setPageCount(pageCount);
        return newPdf;
    }

    public Document createTextDocument(String filePath, String encoding, int wordCount) {
        TextDocument newText = textPrototype.clone();
        newText.setFilePath(filePath);
        newText.setEncoding(encoding);
        newText.setWordCount(wordCount);
        return newText;
    }

    public Document createSpreadsheetDocument(String spreadsheetName, int rowCount, int columnCount) {
        SpreadsheetDocument newSpreadsheet = spreadsheetPrototype.clone();
        newSpreadsheet.setSpreadsheetName(spreadsheetName);
        newSpreadsheet.setRowCount(rowCount);
        newSpreadsheet.setColumnCount(columnCount);
        return newSpreadsheet;
    }
}
