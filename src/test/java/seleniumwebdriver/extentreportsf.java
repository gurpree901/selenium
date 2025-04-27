package seleniumwebdriver;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extentreportsf implements ITestListener {
	public ExtentSparkReporter sparkreporter;
	public ExtentReports extents;
	public ExtentTest test;
	
	
	  public  void onStart(ITestContext context) {
		  sparkreporter =new ExtentSparkReporter(System.getProperty("user.dir")+"\\extentreport \\reports.html");
		  sparkreporter.config().setDocumentTitle("Automation report");
		  sparkreporter.config().setTheme(Theme.DARK);
		  
		  extents=new ExtentReports();
		  extents.attachReporter(sparkreporter);
		  extents.setSystemInfo("computer name", "local host");
		  extents.setSystemInfo("environemt", "QA");
		  extents.setSystemInfo("tester name", "gurpreet");
		  extents.setSystemInfo("os", "windows10");
		  extents.setSystemInfo("browser name", "chrome");
		 
		  }
	  
	  public  void onTestStart(ITestResult result) {
		test=  extents.createTest(result.getName());
		test.lo
		  }
	  
	  public void onTestFailure(ITestResult result) {
		  
		  }

}
