package seleniumwebdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dyanmicpagi {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//pagiation
	String text=	driver.findElement(By.xpath("//div[contains(text(),'Showi')]")).getText();
	int pages=Integer.parseInt( text.substring(text.indexOf("(")+1, text.indexOf("pages")-1));
	
	//for repeating pages
	for(int p=1;p<=pages;p++)
	{
		if(p>1)
		{
			
		}
	}
	

	}

}
