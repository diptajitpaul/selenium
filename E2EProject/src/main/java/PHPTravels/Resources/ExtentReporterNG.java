package PHPTravels.Resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReporterNG {
	
	public static ExtentReports getReportObject()
	{

		// start reporters
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("ExtentReport\\ExtentReport.html");
		// create ExtentReports and attach reporter(s)
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Tester", "Diptajit Paul");
		return extent;

		
	}
	
}
