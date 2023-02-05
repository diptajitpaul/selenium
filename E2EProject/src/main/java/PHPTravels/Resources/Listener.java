package PHPTravels.Resources;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext ;		
import org.testng.ITestListener ;		
import org.testng.ITestResult ;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import PHPTravels.Base.Base;

public class Listener extends Base implements ITestListener{
	
	//Variables for Extent Report
	ExtentHtmlReporter htmlReporter;
	ExtentTest test;
	ExtentReports extent=ExtentReporterNG.getReportObject();
	ThreadLocal<ExtentTest> extentTest=new ThreadLocal();
	
	protected String screenshotPath;
	
	public void onStart(ITestContext context) {
		//This method is called at begining of every <test> node of TestNG xml. If there are 3 <test> nodes in the testng.xml, then it will be called 3 times.
	}
	
	
	public void onTestStart(ITestResult result) {
		//This method is called at begining of every TestNG test.
		// creates a toggle for the given test, adds all log events under it    
        test = extent.createTest(result.getMethod().getMethodName());
        extentTest.set(test);
	}

	public void onTestSuccess(ITestResult result) {
		//Log test Pass
		//test.log(Status.INFO, result.getMethod().getMethodName() + " is a PASS");
		extentTest.get().pass(result.getMethod().getMethodName() + " is a PASS");

	}

	public void onTestFailure(ITestResult result) 
	{
		//Log test fail
		extentTest.get().fail(result.getThrowable().getMessage());
		//Takes screenshot
		try {
			WebDriver driver= (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
			screenshotPath=takeScreenshot(driver);
			//test.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
			extentTest.get().addScreenCaptureFromPath(screenshotPath);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// calling flush writes everything to the log file
        extent.flush();
	}

}
