package day28;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class statictables {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr")).size();
		System.out.println("number of rows:"+rows); 
		int colns=driver.findElements(By.tagName("th")).size();
	String spec=	driver.findElement(By.xpath("/name='BookTable']//tr[5]//td[1]")).getText();
	System.out.println(spec);
	
	//read all data from rows
	for(int r=2;r<=rows;r++)
	{
		for(int j=1;j<=colns;j++)
		{
			String spec2=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+j+"]")).getText();
		}
	}
	
	}
}


