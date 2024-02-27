package automationpractice.Base;

import java.io.FileNotFoundException;
import java.io.*;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class Base {

	public WebDriver driver;
	
public WebDriver initializeDriver() throws IOException
{
	
	try {
		FileInputStream fis=new FileInputStream("C:\\Users\\User\\git\\selenium\\E2EProject\\src\\main\\resources\\automationPractice\\Resources\\Resources.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String url=prop.getProperty("url");
		String browser=prop.getProperty("browser");
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(url);
			
		}
		else if (browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Browser Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.navigate().to(url);
			
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return driver;
	
}

public String takeScreenshot() throws Exception
{

	File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String finalFilePath=System.getProperty("user.dir")+"/ExtentReport/Screenshots/"+"IMG"+System.currentTimeMillis()+".png";
	FileHandler.copy(srcFile, new File (finalFilePath));
	String relativePathOfScreenshot="Screenshots/"+"IMG"+System.currentTimeMillis()+".png";
	return relativePathOfScreenshot;
}

@BeforeClass(alwaysRun=true)
public void initializeTest() throws Exception
{
	initializeDriver();
}

@AfterClass(alwaysRun=true)
public void endTest() throws Exception
{
	driver.quit();
}

}

