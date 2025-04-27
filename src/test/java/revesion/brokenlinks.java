package revesion;

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

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println("size of links:"+links.size());
		for(WebElement value:links)
		{
			String hh=value.getAttribute("href");
			if(hh.equals("null") || hh.equals("empty"))
			{
				System.out.println("not pssible to findout the links");
				continue;
			}
			URL ul=new URL(hh);
			HttpURLConnection k=(HttpURLConnection) ul.openConnection();
			if(k.getResponseCode()>=400)
			{
				System.out.println(hh+"broken links");
			}
			else
			{
				System.out.println(hh+"not broken links");

			}
				
		}

	}

}
