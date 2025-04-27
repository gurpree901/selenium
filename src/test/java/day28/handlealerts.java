package day28;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlealerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[contains(normalize-space(),'Click for JS Alert')]")).click();
		//Alert myalert=driver.switchTo().alert();
		//myalert.accept();
		Thread.sleep(5000);
		//driver.switchTo().alert().accept();
		//confirmation alert
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		//driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
	Alert	myalert=driver.switchTo().alert();
	System.out.println("alert messgae:"+myalert.getText());
	myalert.sendKeys("aman");
	myalert.accept();
		

	}

}
