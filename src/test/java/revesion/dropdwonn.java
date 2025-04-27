package revesion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdwonn {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='country']"));
         Select ss=new Select(dropdown);
         ss.selectByVisibleText("France");
         List<WebElement> drplist=ss.getOptions();
         System.out.println("drop list:"+drplist.size());
         for(WebElement v:drplist)
         {
        	 System.out.println(v.getText());
         }
	}

}
