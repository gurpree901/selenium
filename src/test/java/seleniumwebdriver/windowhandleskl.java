package seleniumwebdriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandleskl {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	String window_id=	driver.getWindowHandle();
	System.out.println(window_id);
	WebElement link=driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']"));
	link.click();
	Set<String >window_ids=driver.getWindowHandles();
	System.out.println(window_ids);

	}

}
