package seleniumwebdriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlinkffdf {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		
		//all links
		List<WebElement >links=driver.findElements(By.tagName("a"));
		System.out.println("number of links:"+links.size());
		
		for( WebElement ln:links)
		{
			String value=ln.getAttribute("href");
			if(value.equals("null")||  value.equals("empty"))
			{
				System.out.println("not possible to find");
				continue;
				
			}
			URL UL=new URL(value);
			HttpURLConnection uj=(HttpURLConnection) UL.openConnection();
			uj.connect();
			if(uj.getResponseCode()>=400)
			{
				System.out.println(value+"====>brokenlink");
			}
			else
			{
				System.out.println(value+"====>not a brokenlink");

			}
		}

	}

}
