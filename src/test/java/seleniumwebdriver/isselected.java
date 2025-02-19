package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isselected {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		WebElement male_radio=driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female_radio=driver.findElement(By.xpath("//input[@id='gender-female']"));
		System.out.println("Before selection");
		System.out.println(male_radio.isSelected());
		System.out.println(female_radio.isSelected());
		
		
		System.out.println("After selection Female");
		female_radio.click();
		System.out.println(male_radio.isSelected());
		System.out.println(female_radio.isSelected());
		Boolean newsletter=driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
		System.out.println("newsletter status:"+newsletter);


		
		

	}

}
