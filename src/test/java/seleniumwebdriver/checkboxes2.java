package seleniumwebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxes2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		List<WebElement>checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input'and @type='checkbox']"));
		System.out.println("number of checkboxes:"+checkboxes.size());
		
		/*for(int i=0;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}*/
		/*for( WebElement check:checkboxes)    //for each loop
		{
			check.click();
		}*/
		
		//select last 3 checkboxes
	//	total checkboxes -how many checkboxes 
		
		/*for(int i=5;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
			
		}*/
		
		//first 3 checkboxes
		/*for(int i=0;i<3;i++)
		{
			checkboxes.get(i).click();
		}*/
		Thread.sleep(5000);
		
		//select unselect column
		/*for(WebElement chec:checkboxes)
		/*{
			if(chec.isSelected())
			{
				chec.click();
			}
			else
			{
				chec.click();
			}*/
		}*/
		/*for(WebElement check:checkboxes)
		{
			if(check.isSelected())
			{
				check.click();
			}
			else
			{
				check.click();
			}*/
		}*/

     
		
		

	}

}
