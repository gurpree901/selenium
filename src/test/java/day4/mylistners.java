package day4;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class mylistners implements ITestListener {
	
	public  void onStart(ITestContext context) {
		System.out.println("this is test execution..");
	    
	  }
	
	public void onTestStart1(ITestResult result) {
		System.out.println("this is test start...");
	  }
	
	public void onTestsuccess(ITestResult result) {
	    System.out.println("this is test success..");
	  }
	
	public void onTestfail(ITestResult result) {
		System.out.println("this test fail");
	  }
	
	public void onTestskipped(ITestResult result) {
	    System.out.println("this is test skipped.."); 
	}
       

}
