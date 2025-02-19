package seleniumwebdriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class statictable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//total number of rows
	int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
	System.out.println("number of rows:"+rows);
	
	//numbrr of column
	int columns=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
	System.out.println("numbe rof columns:"+columns);
	
	//read data from sepeifc column and rows
	String ss=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
	System.out.println(ss);
	
	//read all data from columns and rows
	for(int i=2;i<rows;i++)
	{
		for(int j=1;j<columns;j++)
		{ 
			String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+j+"]")).getText();
			System.out.println(value);

		}
	}
		
	
	
	
	

	}

}
