package day28;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
		List<WebElement> listts=driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='presentation']//span"));
		System.out.println("prine all list:"+listts.size());
		
		/*for(WebElement value:listts)
		{
			System.out.println(value.getText());
		}*/
		
		for(int i=0;i<listts.size();i++)
		{
			System.out.println(listts.get(i).getText());
			if(listts.get(i).getText().equals("selenium"))
			{
				listts.get(i).click();
				break;
			}
		}

	

}
}
