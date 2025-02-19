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

public class brokeninksd {

	public static void main(String[] args) throws IOException {
WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		List<WebElement >links=driver.findElements(By.tagName("a"));
		System.out.println("all links :"+links.size());
		for(WebElement a:links)
		{
			System.out.println(a.getText());
			String hf=a.getAttribute("href");
			if(hf.equals("empty")||  hf.equals("null"))
			{
				System.out.println("it is not possible ");
				continue;
			}
			URL UL=new URL(hf);
			HttpURLConnection ul=(HttpURLConnection) UL.openConnection();
			ul.connect();
			if(ul.getResponseCode()>=400)
			{
				System.out.println(hf+"")
			}
		}
		
	
		
		
;
	}

}
