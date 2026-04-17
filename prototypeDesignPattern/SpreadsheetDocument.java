public class SpreadsheetDocument implements Document {
    private String spreadsheetName;
    private int rowCount;
    private int columnCount;

    public SpreadsheetDocument() {
        this.spreadsheetName = "default.xlsx";
        this.rowCount = 0;
        this.columnCount = 0;
    }

    public SpreadsheetDocument(String spreadsheetName, int rowCount, int columnCount) {
        this.spreadsheetName = spreadsheetName;
        this.rowCount = rowCount;
        this.columnCount = columnCount;
    }

    public void setSpreadsheetName(String spreadsheetName) { this.spreadsheetName = spreadsheetName; }
    public void setRowCount(int rowCount) { this.rowCount = rowCount; }
    public void setColumnCount(int columnCount) { this.columnCount = columnCount; }

    @Override
    public SpreadsheetDocument clone() {
        return new SpreadsheetDocument(this.spreadsheetName, this.rowCount, this.columnCount);
    }

    @Override
    public void open() {
        System.out.println("\nOpening Spreadsheet Document: " + spreadsheetName + " (" + rowCount + " rows, " + columnCount + " columns)");
        System.out.println("Type: Spreadsheet, Name: " + spreadsheetName + ", Rows: " + rowCount + ", Columns: " + columnCount);
        System.out.println();
    }

    @Override
    public String getType() {
        return "Spreadsheet";
    }
}