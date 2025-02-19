 package seleniumwebdriver;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readingdatafromexcel {

	public static void main(String[] args) throws IOException  {
		
		//reading data from excel
		FileInputStream f=new FileInputStream("C:\\Users\\gurpreet singh\\eclipse-workspace\\seleniumwebdriver\\test data\\Dummy_Excel_Sheet.xlsx");
		
		//workbook
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet sh=wb.getSheetAt(0);
		int row=sh.getLastRowNum();
		int total=sh.getRow(1).getLastCellNum();
		System.out.println("number of rows:"+total);
		System.out.println("numberof cells:"+total);

	}
}


