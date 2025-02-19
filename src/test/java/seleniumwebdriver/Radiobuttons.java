package seleniumwebdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttons {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
	WebElement 	male_radio=driver.findElement(By.xpath("//input[@id='gender-male']"));
	WebElement female_radio=driver.findElement(By.xpath("//input[@id='gender-female']"));
	System.out.println("before selection");
	System.out.println(male_radio.isSelected());  //false
	System.out.println(female_radio.isSelected()); //false
	
	System.out.println("after selection");
	System.out.println(male_radio.isSelected());
	System.out.println(male_radio.isSelected());


	
	


	

	}

}
