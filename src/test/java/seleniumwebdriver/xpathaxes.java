package seleniumwebdriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathaxes {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		String text=driver.findElement(By.xpath("//a[normalize-space()='Dr. Lal Pathlabs Ltd']/self::*")).getText();
		System.out.println(text);
		String text2=driver.findElement(By.xpath("//a[normalize-space()='Dr. Lal Pathlabs Ltd']/parent::td")).getText();
		System.out.println(text2);
		List<WebElement>childs=driver.findElements(By.xpath("//a[normalize-space()='Dr. Lal Pathlabs Ltd']/ancestor::tr/child::td"));
		System.out.println("number of child elemnt:"+childs.size());
		
		//Ancestor
		 String text3=driver.findElement(By.xpath("//a[contains(text(),'Abbott India Ltd')]/ancestor::tr")).getText();
		 System.out.println("ancestor elemnt:"+text3);
		 
		 //descendant
	List<WebElement>	text5= driver.findElements(By.xpath("//a[contains(text(),'Vijaya Diagnostic')]/ancestor::tr/descendant::td"));
	System.out.println("number of descendent :"+text5.size());
	
	
	//following
	List<WebElement>text8=driver.findElements(By.xpath("//a[contains(text(),'Crompton Greaves Con')]/ancestor::tr/following::*"));
	System.out.println("number of following nodes:"+text8.size());
	
	//following-sibling
	
	List<WebElement>sibling=driver.findElements(By.xpath("//a[contains(text(),'Crompton Greaves Con')]/ancestor::tr/following-sibling::*"));
	System.out.println("number of following sibling:"+sibling.size());
	//preceding
	List<WebElement >siblingg=driver.findElements(By.xpath("//a[contains(text(),'Westlife Foodworld')]/ancestor::tr/preceding::tr"));
	System.out.println("number of preceding elemnt:"+sibling.size());
	
	
		

	}

}
