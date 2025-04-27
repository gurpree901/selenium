package seleniumwebdriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownk {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='country']"));
		Select st=new Select(dropdown);
		st.selectByVisibleText("France");
		List<WebElement>alloptions=st.getOptions();
		System.out.println("alloptions:"+alloptions.size());
		for(WebElement value:alloptions)
		{
			System.out.println(value.getText());
		}

	}

}
