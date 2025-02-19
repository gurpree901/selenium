package seleniumwebdriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dyanmicdropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(5000);
		
		//total list
		
		List<WebElement> listgoogle=driver.findElements(By.xpath("//ul[@class='G43f7e' and @role='listbox']//li//span"));
		System.out.println(listgoogle.size());
		
		for(WebElement li:listgoogle)
		{
			System.out.println(li.getText());
			if(li.getText().equals("selenium webdriver"));
			li.click();
		}
		
		

	}

}
