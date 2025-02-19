package seleniumwebdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actionsss {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		WebElement laptop=driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']"));
	WebElement	macs=driver.findElement(By.xpath("//a[text()='Macs (0)']"));
		Actions act=new Actions(driver);
		act.moveToElement(laptop).moveToElement(macs).click().build().perform();
		
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		mywait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[text()='Macs (0)']")));	
		

	}  

}
