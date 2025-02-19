package seleniumwebdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwaut {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		 WebElement search_feild=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='small-searchterms']")));
		 search_feild.sendKeys("laptop");
		 
		 
		// Togo displayed
		WebElement logo= driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		logo.isDisplayed();
		System.out.println("logo displayed:"+logo);
		
		
			
		
		 

	}

}
