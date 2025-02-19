
package seleniumwebdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class dropdownsdj {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='customerCurrency']"));
		Select ss=new Select(dropdown);
		ss.selectByVisibleText("Euro");
		
		//logo displayed
		Boolean logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		System.out.println("logo displayed:"+logo);
		
		if(logo=true)
		{
			System.out.println("logo displayed");
		}
		else
		{
			System.out.println("not displayed");
		}
		WebElement computers=driver.findElement(By.xpath("//a[text()='Computers ']"));
		Actions act=new Actions(driver);
		act.moveToElement(computers).build().perform();
		
		

	}

}
