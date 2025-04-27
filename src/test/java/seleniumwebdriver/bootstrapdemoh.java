package seleniumwebdriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bootstrapdemoh {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		WebElement dropdown=driver.findElement(By.xpath("//button[@title='HTML, CSS']"));
		dropdown.click();
		List<WebElement > lists=driver.findElements(By.xpath("//ul[contains(@class,'multi')]//li//a"));
		for(WebElement v:lists)
		{
			System.out.println(v.getText());
		}
		

	}

}
