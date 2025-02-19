package seleniumwebdriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandle {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://122.160.40.168:9090/nfdp/#/");
		driver.manage().window().maximize();
	String	windowid=driver.getWindowHandle();
	System.out.println(windowid);   // single id
	
	Set <String> windo=driver.getWindowHandles();
	System.out.println(windo);
	

	}

}
