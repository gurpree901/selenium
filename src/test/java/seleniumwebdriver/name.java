package seleniumwebdriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class name {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		Boolean logos=driver.findElement(By.xpath("//h1[text()='Register']")).isDisplayed();
		if(logos=true)
		{
			System.out.println("logo is dispaying");
		}
		else
		{
			System.out.println("logo not display");
		}
		
		WebElement links =driver.findElement(By.xpath("//a[text()='Log in']"));
		links.click();
		List<WebElement>number_links=driver.findElements(By.tagName("a"));
		System.out.println(number_links.size());
	WebElement	radio=driver.findElement(By.xpath("//input[@id='gender-female']"));
	radio.click();
		WebElement feild_name=driver.findElement(By.xpath("//input[@id='FirstName']"));
		feild_name.sendKeys("gurpreet singh");
		
		WebElement last_name=driver.findElement(By.xpath("//input[@id='LastName']"));
		last_name.sendKeys("singh");

	}

}
