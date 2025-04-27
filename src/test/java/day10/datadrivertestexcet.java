package day10;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class datadrivertestexcet {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("");
		driver.manage().window().maximize();
		
		String filepath=System.getProperty("user.dir"+"\\testdata\\calcuator");
		Excelutility.getrowcount(filepath, "sheet1");
		for(int i=0;i<=rows;i++)
		{
			String rateofintrest=Excelutility.getcelldata(filepath, "sheet1", i, 0);
			String rateo=Excelutility.getcelldata(filepath, "sheet1", i, 1);
			String ff=Excelutility.getcelldata(filepath, "sheet1", i, 2);
			String hh=Excelutility.getcelldata(filepath, "sheet1", i, 3);
			String bb=Excelutility.getcelldata(filepath, "sheet1", i, 4
					);
			
		}
		


		


		

	}

}
