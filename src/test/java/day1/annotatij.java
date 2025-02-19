package day1;

import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class annotatij {
	WebDriver driver;
	@Test (priority=1)
	void openapp()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
	}
	@Test (priority=2)
	void checklinks()
	{
	List<WebElement>	links=driver.findElements(By.tagName("a"));
	System.out.println("all links:"+links.size());
	
	for( WebElement a:links)
	{
		System.out.println(a.getText());
	}
	
	}
	@Test (priority=3)
	void testlogo()
	{
	boolean	logos=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	if(logos=true)
	{
		System.out.println("logo displayed");
	}
	else
	{
		System.out.println("logo not displayed");
	}
	}
	
	javaScriptExecutor js=driver;

	
}
