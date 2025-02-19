package seleniumwebdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement female_radio=driver.findElement(By.xpath("//input[@id='female']"));
		WebElement male_radio=driver.findElement(By.xpath("//input[@id='male']"));
		System.out.println("before selection...");
		System.out.println("Select staus of femaleradio button:"+female_radio.isSelected());
		System.out.println("Select staus of maleradio button:"+male_radio.isSelected());
		
		male_radio.click();
		System.out.println("after selection...");
		System.out.println("Select staus of femaleradio button:"+female_radio.isSelected());
		System.out.println("Select staus of femaleradio button:"+male_radio.isSelected());


		


		



		

	}

}
