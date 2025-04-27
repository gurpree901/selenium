package seleniumwebdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddropk2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		//source file
	  WebElement	source_file=driver.findElement(By.xpath("//div[@class='dragableBox']"));
	WebElement  target_file= driver.findElement(By.xpath("//div[@class='dragableBoxRight']"));
	act.dragAndDrop(source_file, target_file).perform();

	}

}
