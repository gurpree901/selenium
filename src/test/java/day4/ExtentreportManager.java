package day4;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentreportManager implements ITestListener {
	public ExtentSparkReporter sparkReporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	
	public void onStart(ITestContext context) {
		sparkReporter=new ExtentSparkReporter(System.getProperty("user.direc")+"/reports/myreports.html");
		sparkReporter.config().setDocumentTitle("Automation Report");
		sparkReporter.config().setReportName("functional Testing");
		sparkReporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(sparkReporter);
		
		extent.setSystemInfo("computer name", "loclhost");
		extent.setSystemInfo("environemnt", "QA");
		extent.setSystemInfo("tester name", "gurpreet");
		extent.setSystemInfo("OS", "windows10");
		extent.setSystemInfo("browser name", "chrome");
		
		
	  }
	
	public void onTestStart(ITestResult result) {
		
		
	  }
	
	
	public void onTestSuccess(ITestResult result) {
		
	  }
	
	  public void onTestFailure(ITestResult result) {
		  
		  }
	  
	  public void onTestSkipped(ITestResult result) {
		  
		  
		  }
	
	


}
