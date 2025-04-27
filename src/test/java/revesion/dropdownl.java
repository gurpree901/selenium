package revesion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownl {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement dropdownk=driver.findElement(By.xpath("//select[@id='country']"));
		Select ss=new Select(dropdownk);
		ss.selectByVisibleText("France");
	List<WebElement> dropdown=	ss.getOptions();
	System.out.println("all options:"+dropdown.size());
	for( WebElement value:dropdown)
	{
		System.out.println(value.getText());
	}
	

	}

}
