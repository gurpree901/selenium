
package revesion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrapdrpdwn {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class='multiselect-selected-text']")).click();
		//capture all options and size
		List<WebElement> all=driver.findElements(By.xpath("//ul[contains(@class,'multise')]//label"));
		System.out.println("all options:"+all.size());
		
		for( WebElement valeu:all)
		{
			String a=valeu.getText();
			if(a.equals("Java") ||  a.equals("Python") || a.equals("MySQL"));
			{
				valeu.click();
			}
		}

	}

}
