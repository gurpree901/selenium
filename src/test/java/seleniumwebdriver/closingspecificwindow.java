package seleniumwebdriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class closingspecificwindow {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='OrangeHRM, Inc']"))).click();
		Set<String> windows=driver.getWindowHandles();
		for( String winid:windows)
		{
			String title=driver.switchTo().window(winid).getTitle();
			System.out.println(title);
			
			if(title.equals("Human Resources Management Software | OrangeHRM\r\n"))  title.equals("any other title");
			{
				driver.close();
				break;
			}
			
			
				
			
		}
		
		

	}

}
