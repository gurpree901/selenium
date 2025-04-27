package revesion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosugesttiondp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//search selenium
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
		
		List<WebElement >lists=driver.findElements(By.xpath("//ul[@class='G43f7e']//li//div[@role='option']"));
		System.out.println("number of list:"+lists.size());
		for(int i=0;i<lists.size();i++)
		{
			System.out.println(lists.get(i).getText());
			if(lists.get(i).getText().equals("selenium"))
			{
				lists.get(i).click();
				break;
			}
		}

	}

}
