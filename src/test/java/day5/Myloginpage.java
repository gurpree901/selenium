package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Myloginpage {
	WebDriver driver;
	
	//constructor
	
	public Myloginpage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	}
	void loginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//locator
	By username=By.xpath("//input[@name='username']");
By password=By.xpath("//input[@type='password']");
By button=By.xpath("//button[@type='submit']");


//Actionmethods

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
