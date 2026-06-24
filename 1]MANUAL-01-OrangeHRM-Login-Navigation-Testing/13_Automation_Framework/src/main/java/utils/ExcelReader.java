package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

    private XSSFWorkbook workbook;
    private XSSFSheet sheet;

    // Constructor
    public ExcelReader(String excelPath, String sheetName) {

        try {
            FileInputStream fis = new FileInputStream(excelPath);

            workbook = new XSSFWorkbook(fis);

            sheet = workbook.getSheet(sheetName);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Get Total Rows
    public int getRowCount() {

        return sheet.getPhysicalNumberOfRows();
    }

    // Get Total Columns
    public int getColumnCount() {

        Row row = sheet.getRow(0);

        return row.getPhysicalNumberOfCells();
    }

    // Get Cell Data
    public String getCellData(int rowNum, int colNum) {

        DataFormatter formatter = new DataFormatter();

        Cell cell = sheet.getRow(rowNum).getCell(colNum);

        return formatter.formatCellValue(cell);
    }

    // Get Data for TestNG DataProvider
    public Object[][] getSheetData() {

        int rows = getRowCount();
        int cols = getColumnCount();

        Object[][] data = new Object[rows - 1][cols];

        for (int i = 1; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                data[i - 1][j] = getCellData(i, j);
            }
        }

        return data;
    }

    // Close Workbook
    public void closeWorkbook() {

        try {

            workbook.close();

        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}