package day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropownf {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='country']"));
		Select sc=new Select(dropdown);
		sc.selectByVisibleText("France");
		List<WebElement>optionss=sc.getOptions();
		System.out.println("all elemnts:"+optionss.size());
		for(WebElement value:optionss)
		{
			System.out.println(value.getText());
		}
		
		

	}

}
