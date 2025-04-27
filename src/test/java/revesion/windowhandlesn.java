package revesion;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandlesn {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//single window id
		String child_win=driver.getWindowHandle();
		System.out.println(child_win);
		//multiplewindow ids
		WebElement ss=driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']"));
		ss.click();
		Set<String>parent_win=driver.getWindowHandles();
		System.out.println(parent_win);
	}

}
