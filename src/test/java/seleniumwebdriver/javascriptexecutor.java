 package seleniumwebdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptexecutor {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement inputbox=driver.findElement(By.xpath("//input[@id='name']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("arguments[0].setAttribute('value','aman')",inputbox);
		js.executeScript("arguments[0].setattribute('value','aman')",inputbox);
		
		WebElement radi_button=driver.findElement(By.xpath("//input[@id='male']"));
		js.executeScript("arguments[0].click()", radi_button);
		
				

	}

}