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

public class brokenlinks {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		//all links
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println("all links:"+links.size());
		
		for(WebElement li:links)
		{
			String hrefatt=li.getAttribute("href");
			if(hrefatt.equals("null") || hrefatt.equals("empty"))
			{
				System.out.println("href vaue is empty or null so not possible tocheck");
				continue;
			}
			
			URL url=new URL(hrefatt);
			HttpURLConnection connlinkurl=(HttpURLConnection) url.openConnection();
			connlinkurl.connect();
			if(connlinkurl.getResponseCode()>=400)
			{
				System.out.println(hrefatt+"====>broken links");
			}
			else
			{
				System.out.println(hrefatt+"====>not a broken link+");
			}
			
		}
		

	}

}
