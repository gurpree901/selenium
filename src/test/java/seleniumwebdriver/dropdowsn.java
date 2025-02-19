package seleniumwebdriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowsn {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement dropdown=driver.findElement(By.xpath("//select[@class='form-control' and @id='country']"));
		dropdown.click();
		
		//select option
		Select ss=new Select(dropdown);
		//ss.selectByVisibleText("France");
		ss.selectByIndex(4);
		//all options
		
	List<WebElement >	all=ss.getOptions();
	System.out.println("all options:"+all.size());
	
	//for each
	for(WebElement value:all)
	{
		System.out.println(value.getText());
		if(value.equals("France"))
		{
			value.click();
		}
	}
	

	}

}
