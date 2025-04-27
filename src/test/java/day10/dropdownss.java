package day10;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownss {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='country']"));
		//dropdown.click();
		Select ss=new Select(dropdown);
		ss.selectByVisibleText("France");
		List<WebElement> options=ss.getOptions();
		System.out.println(options.size());
		
		for(WebElement all:options)
		{
			System.out.println(all.getText());
		}
	

	}

}
