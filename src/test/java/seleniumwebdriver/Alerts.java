package seleniumwebdriver;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		 //driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		//Alert myalert= driver.switchTo().alert();
		//myalert.accept();
		//driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		//Thread.sleep(5000);
		//driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(5000);
	Alert	myalert=driver.switchTo().alert();
	myalert.getText();
	System.out.println("message on alert:"+myalert.getText());
	myalert.sendKeys("welcome");
	myalert.accept();
	
	String text =driver.findElement(By.xpath("You entered: guru")).getText();
	if(text.contains("guru"))
	{
		System.out.println("test passed");
	}
	else
	{
		System.out.println("test failed");
	}
	
	
	
	
	
		

		
	}

}
