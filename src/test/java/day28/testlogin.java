package day28;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testlogin {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		String window_id=driver.getWindowHandle();
		System.out.println("print parent window id:"+window_id);
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		Set<String> window_ids=driver.getWindowHandles();
		System.out.println("print window ids:"+window_ids);

	}

}
