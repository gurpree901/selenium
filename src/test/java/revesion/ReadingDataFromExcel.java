package revesion;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {

    public static void main(String[] args) {
        // Path to the Excel file

        // Using try-with-resources to ensure file stream and workbook are properly closed
        try (FileInputStream file = new FileInputStream("C:\\Users\\gurpreet singh\\eclipse-workspace\\seleniumwebdriver\\testdata\\testdata.xlsx");
             XSSFWorkbook workbook = new XSSFWorkbook(file)) {

            // Getting the sheet by its name
            XSSFSheet sheet = workbook.getSheet("sheet");
            System.out.println("print no.of rows:"+sheet);

            // Getting the number of rows and columns
            int totalRows = sheet.getPhysicalNumberOfRows();
            int totalCells = sheet.getRow(0).getPhysicalNumberOfCells();

            // Output the number of rows and columns
            System.out.println("Total number of rows: " + totalRows);
            System.out.println("Total number of columns: " + totalCells);
            
        
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
