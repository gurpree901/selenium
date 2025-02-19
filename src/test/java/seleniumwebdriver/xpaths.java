package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpaths {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Aman");
		
		// innertext and linktext
		//driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']")).click();  
		Boolean displystatus=driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
		if(displystatus=true)
		{
			System.out.println("display text");
		}
		else
		{
			System.out.println("not display");
		}
		
		String value=driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
		System.out.println(value);
		
		

	}

}
