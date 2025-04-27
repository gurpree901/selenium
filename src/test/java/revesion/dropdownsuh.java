package revesion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownsuh {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement drpdown=driver.findElement(By.xpath("//select[@id='country']"));
		drpdown.click();
		Select ss=new Select(drpdown);
		ss.selectByIndex(8);
	List<WebElement >optins=ss.getOptions();
		System.out.println("size of all elemnts:"+optins.size());
		for(WebElement value:optins)
		{
			System.out.println("print all values:"+value.getText());
		}
		
		

	

}
}
