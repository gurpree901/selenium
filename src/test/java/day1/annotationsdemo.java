package day1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class annotationsdemo {
	WebDriver driver;
	@Test (priority=1)
	void openapp()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
	}
	@Test(priority=2)
	void username() 
	{
		
	WebElement 	search_box=driver.findElement(By.xpath("//input[@class='search-box-text ui-autocomplete-input']"));
	search_box.sendKeys("laptop");
	}
	@Test (priority=3)
	void logout()
	{
		driver.close();
	}

}
