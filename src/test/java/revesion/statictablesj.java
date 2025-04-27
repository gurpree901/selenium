package revesion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class statictablesj {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//number of rows
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr")).size();
		System.out.println("number of rows:"+rows);
		
		int columns=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("number of columns:"+columns);
		
		//specific value
		String b=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		System.out.println("specific value:"+b);
		//read data from all columns
		for(int r=2;r<rows;r++)
		{
			for(int c=1;c<=columns;c++)
			{
				String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.println(value);
			}
		}

	}

}
