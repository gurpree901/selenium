package seleniumwebdriver;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertf {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
		//Thread.sleep(5000);
		
		//popup
		//Alert al=driver.switchTo().alert();
		//al.accept();
		
		//driver.findElement(By.xpath("//button[@id='confirmBtn']")).click();
		//Alert al=driver.switchTo().alert();
		//al.dismiss();
		
		driver.findElement(By.xpath("//button[@id='confirmBtn']")).click();
		Alert al=driver.switchTo().alert();
		al.getText();
		al.accept();
		
		

	}

}
