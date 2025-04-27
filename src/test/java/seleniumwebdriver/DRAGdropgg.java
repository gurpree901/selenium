package seleniumwebdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DRAGdropgg {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		WebElement source_ele=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target_ele=driver.findElement(By.xpath("//div[@id='droppable']"));
		act.dragAndDrop(source_ele, target_ele).build().perform();

	}

}
