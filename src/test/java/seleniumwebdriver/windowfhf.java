package seleniumwebdriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class windowfhf {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")));
	  Set<String> windowids=	driver.getWindowHandles();
	  for( String win:windowids)
	  {
		 String title= driver.switchTo().window(win).getTitle();
		 System.out.println(title);
	  }
		
	}

}
