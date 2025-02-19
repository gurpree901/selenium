package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHRMLOGIN {
	
   //constructor
	WebDriver driver;//class variable
	

	 OrangeHRMLOGIN(WebDriver driver)
	{
		this.driver=driver;   //this keyword
		
	}
	
	
	//locators
	
	By username=By.xpath("//input[@name='username']");
	By password=By.xpath("//input[@type='password']");
	By button=By.xpath("//button[@type='submit']");
	
	
	//Actions methods
	
	public void setusername(String user)
	{
		driver.findElement(username).sendKeys(user);
	}
	
	public void setpassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clicklogin()
	{
		driver.findElement(button).click();
	}
	
	

}
