package day10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutility {
	public static FileInputStream file;
	public static FileOutputStream file1;
	public static XSSFWorkbook wb;
	public static XSSFSheet sh;
	public static XSSFRow rows;
	public XSSFCell columns;
	
	
	public static int getrowcount(String xlfile,String sheet) throws IOException
	{
		file=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(file);
		sh=wb.getSheet(sheet);	
		int rowcount=sh.getLastRowNum();
		wb.close();
		file.close();
		
		return rowcount;
		
		
	}
	
	public static int getcellcount(String xlfile,String sheet,int rownum) throws IOException
	{
		file=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(file);
		sh=wb.getSheet(sheet);
	   try {
		rows= sh.getRow(rownum);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  int cellcount= rows.getLastCellNum();
	  wb.close();
	  file.close();
	    
		return cellcount;
		
		
		
	}
	public static String getcelldata(String xlfile,String sheet,int rownum,int column) throws IOException
	{
		file=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(file);
		sh=wb.getSheet(sheet);	
		int rowcount=sh.getLastRowNum();
	XSSFCell celll=rows.getCell(column);
		wb.close();
		file.close();
		String data;
		try
		{
			DataFormatter dt=new DataFormatter();
			dt.formatCellValue(celll);


		}
		catch(Exception e)
		{
			data="";
		}
		wb.close();
		file.close();
		
		
		return sheet;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
