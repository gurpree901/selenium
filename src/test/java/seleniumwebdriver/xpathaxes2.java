package seleniumwebdriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathaxes2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://username:password@money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		List<WebElement>child=driver.findElements(By.xpath("//a[normalize-space()='Tata Consumer Produc']/ancestor::tr/child::td"));
		System.out.println("number of childs:"+child.size());
		
		
		//name
		String text=driver.findElement(By.xpath("//a[normalize-space()='Tata Consumer Produc']/ancestor::tr/child::td")).getText();
		System.out.println(text);
		
	
		
		

	}

}    
