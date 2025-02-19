package seleniumwebdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseoveraction {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		WebElement desktops=driver.findElement(By.xpath("//a[text()='Desktops']"));
		WebElement mac =driver.findElement(By.xpath("//a[text()='Mac (1)']"));
		
		//action class
		Actions act=new Actions(driver);
		act.moveToElement(desktops).moveToElement(mac).click().build().perform();
				
				
		
		
		

	}

}
