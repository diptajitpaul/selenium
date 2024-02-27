package automationpractice.Resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReporter {
	
	public static ExtentReports extentReportersInit()
	{
		ExtentHtmlReporter exthtml=new ExtentHtmlReporter("C:\\Users\\User\\git\\selenium\\E2EProject\\ExtentReport\\ExtentReport.html");
		ExtentReports extreports=new ExtentReports();
		extreports.attachReporter(exthtml);
		extreports.createTest("Extent Report","Diptajit Paul");
		
		
		return extreports;
		
	}

}
