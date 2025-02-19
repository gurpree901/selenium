package seleniumwebdriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dyanmicj {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		//search
		driver.findElement(By.name("a")).sendKeys("selenium Webdriver");
		Thread.sleep(5000);
		
		//list all
		List<WebElement >listgoogle=driver.findElements(By.xpath("//ul[@class='G43f7e' and @role='listbox']//li//div//span"));
		System.out.println("number of list:"+listgoogle.size());
		for(int i=0;i<listgoogle.size();i++)
		{
			System.out.println(listgoogle.get(i).getText()); 
		}
		
		

	}

}
