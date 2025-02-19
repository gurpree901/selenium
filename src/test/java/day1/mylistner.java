package day1;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class mylistner implements ITestListener 
{
	
	
	 public void onStart(ITestContext context) {
		    System.out.println("this is on test start");
		 
		  }
	public  void onTestStart(ITestResult result) {
		System.out.println("this is on test start...");
		
		
	  }
	
			
	public void onTestSuccess(ITestResult result) {
		System.out.println("this is on test passed..");
		
		
	  }
	
	public void onTestFailure(ITestResult result) {
		System.out.println("this is on test failed");
		
	  }
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("this is on test skipped");
	  }
	
	public void onTestfinish(ITestResult result) {
		System.out.println("this is on test finish");
	  }
	
	





	

}
