package seleniumwebdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class statichjk {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		   //rows all
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("numbe of rows:"+rows);
		
		
		//columns
		int columns=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("number of columns:"+columns);
		
		//spedific columns
		String ss=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		System.out.println(ss);
		
		for(int i=2;i<rows;i++)
		{
			for(int j=2;j<columns;j++)
			{
				String o=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+j+"]")).getText();  //paramterization
				System.out.println(o);

			}
		}
		
		
		
	}

}
