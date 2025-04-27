package revesion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownas {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement dropdpwn=driver.findElement(By.xpath("//select[@id='country']"));
		Select sc=new Select(dropdpwn);
		sc.selectByVisibleText("Canada");
		List<WebElement>options=sc.getOptions();
		System.out.println("all options:"+options.size());
		for( WebElement value:options)
		{
			System.out.println(value.getText());
		}
		
		
	}

}
