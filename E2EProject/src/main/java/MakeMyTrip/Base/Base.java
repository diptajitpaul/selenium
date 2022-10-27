package MakeMyTrip.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import MakeMyTrip.Resources.Log;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;


public class Base {

	protected WebDriver driver;
	
	public WebDriver initializeDriver() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\User\\eclipse-workspace\\E2EProject\\src\\main\\resources\\MakeMyTrip\\Resources.properties");
		prop.load(fis);
		String browser=prop.getProperty("browser");
		String url=prop.getProperty("url");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser Drivers\\chromedriver.exe");
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			driver.get(url);
			Log.info("Chrome Driver initiated");
		}
		if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			driver.get(url);
			Log.info("Firefox Driver initiated");
		}
		driver.manage().window().maximize();
		Log.info("Browser maximized");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		return driver;
	}
	
	public String takeScreenshot(WebDriver driver) throws Exception
	{
		String imageName="IMG"+System.currentTimeMillis()+".png";
		String finalImagePath=System.getProperty("user.dir")+"\\ExtentReport\\Screenshots\\"+imageName;
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcfile, new File(finalImagePath));
		String relativePathOfScreenshot= ".\\Screenshots\\"+imageName;		
		return relativePathOfScreenshot;
		
		
	}
	
	@BeforeTest(alwaysRun=true)
	public void intializeTest() throws Exception
	{
		driver=initializeDriver();

	}
	
	@AfterTest(alwaysRun=true)
	public void endTest()

	{
		driver.quit();
	}
	
	public WebElement wait(WebElement webelement)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		return wait.until(ExpectedConditions.visibilityOf(webelement));
	}
	
	

}
