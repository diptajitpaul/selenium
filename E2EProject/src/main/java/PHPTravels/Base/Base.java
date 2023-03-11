package PHPTravels.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.*;

import PHPTravels.Resources.Log;


public class Base {

	public WebDriver driver;
	
	public WebDriver initializeDriver() throws IOException
	{
		try {
		FileReader fis= new FileReader("C:\\Users\\User\\git\\selenium\\E2EProject\\src\\main\\resources\\PHPTravels\\Resources.properties");
		//FileInputStream fis=new FileInputStream("C:\\Users\\User\\git\\selenium\\E2EProject\\src\\main\\resources\\PHPTravels\\Resources.properties");
		Properties prop=new Properties();
		
		prop.load(fis);
		
		String browser=System.getProperty("browser")!=null ? System.getProperty("browser") : prop.getProperty("browser");
		
		//String browser=prop.getProperty("browser");
		String url=prop.getProperty("url");
		
		
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.get(url);
			Log.info("Chrome Driver initiated");
		}
		if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Browser Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().deleteAllCookies();
			driver.get(url);
			Log.info("Firefox Driver initiated");
		}
		driver.manage().window().maximize();
		Log.info("Browser maximized");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}

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
	
	@BeforeClass(alwaysRun=true)
	public void intializeTest() throws Exception
	{
		driver=initializeDriver();

	}
	
	@AfterClass(alwaysRun=true)
	public void endTest()

	{
		driver.quit();
	}
	

	
	public void fluentWait(WebElement webelement)
	{
		FluentWait wait = new FluentWait(driver);
		wait.withTimeout(Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(webelement));
	}
	
//You can remove the below test() method. I had added it just to practice few things. This doesnot have any dependency
//anywhere in the project
	public void test() throws IOException
	{
		FileReader fr=new FileReader("");
		Properties prop=new Properties();
		prop.load(fr);
		prop.getProperty("user.dir");
		
		WebDriver driver=new ChromeDriver();
		
		
		int a[]=new int[5];
		List<String> ls=new ArrayList<String>();
		Set<String> s=new HashSet<String>();
		
		Iterator<String> i=s.iterator();
		String parentWindow=i.next();
		while(i.hasNext())
		{
			if(i.next().contentEquals(""))
			{
				driver.switchTo().window(parentWindow);
			}
			
			
		}
		
		driver.findElement(By.tagName("a"));

File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileHandler.copy(srcFile, new File(""));
		
		
		
	}
	
	
	

}
