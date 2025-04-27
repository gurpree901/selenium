package day9;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		//total links
		List<WebElement >links=driver.findElements(By.tagName("a"));
		System.out.println("total links :"+links);
		for(WebElement li:links)
		{
			String ss= li.getAttribute("href");
			if(ss.equals("Empty") || ss.equals(null))
			{
				System.out.println("not able to find the links");
			}
			URL ul=new URL(ss);
			HttpURLConnection res=(HttpURLConnection) ul.openConnection();
			if(res.getResponseCode()>=400)
			{
				System.out.println(ss+"broken links");
			}
			else
			{
				System.out.println(ss+"not broken links");
			}
			
		}

	}

}
