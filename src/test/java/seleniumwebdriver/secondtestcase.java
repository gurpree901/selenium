package seleniumwebdriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class secondtestcase {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/");
		//Thread.sleep(50000);
		driver.manage().window().maximize();
		driver.findElement(By.name("search")).sendKeys("computer");
		WebElement logo=driver.findElement(By.xpath("//img[@title='Your Store']"));
		Boolean status=logo.isDisplayed();
		if(status=true)
		{
			System.out.println("LOGO DISPLAYED");
		}
		else
		{
			System.out.println("logo not displayed");
		}
		
		//driver.findElement(By.linkText("Components")).click(); //linktext
		//driver.findElement(By.partialLinkText("co")).click(); // partiallinktext
		
		//List<WebElement> hyperlinks=driver.findElements(By.xpath("//span[normalize-space()='My Account']"));  //multiple elemnts
		
		//hyperlinks.size();
		
		
		List <WebElement> links=driver.findElements(By.tagName("a"));
		links.size();
		
		
		

	}

}
