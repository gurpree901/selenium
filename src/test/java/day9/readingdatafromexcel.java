package day9;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readingdatafromexcel {

	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\testdata.xlsx");
	XSSFWorkbook workbbok=new XSSFWorkbook(file);
	XSSFSheet sh=workbbok.getSheet("sheet");
	int row=sh.getLastRowNum();  //get last row number
	int columns=sh.getRow(1).getLastCellNum();//get last column number
	System.out.println("number of rows:"+row);
	System.out.println("number of columns:"+columns);
	
	
		
		
		

	}

}
