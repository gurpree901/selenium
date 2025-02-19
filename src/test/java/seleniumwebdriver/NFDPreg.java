package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NFDPreg {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://122.160.40.168:9090/nfdp/#/registration/individual");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("8269874465");
		driver.findElement(By.xpath("//input[@placeholder='Enter Captcha']")).sendKeys("bbbhn6");
		//driver.findElement(By.xpath("//button[normalize-space()='Send OTP']"));
		//Actions actions = new Actions(driver);
		//actions.scrollToElement(By.xpath("//button[normalize-space()='Send OTP']")).click().perform();
		WebElement firstbutton= driver.findElement(By.xpath("//button[normalize-space()='Send OTP']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(firstbutton);
		actions.click().perform();
	}

}
