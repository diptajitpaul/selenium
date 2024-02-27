package PHPTravels.Tests;
import PHPTravels.Base.Base;
import PHPTravels.PageObjects.HomePage;
import PHPTravels.PageObjects.HotelSearchResultPage;
import PHPTravels.Resources.Log;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class test_validateHomePage extends Base {

	
@BeforeClass
public void getDriver()
{
	driver=super.driver;
}
	
@Test(priority=-1,groups={"Regression"})
public void validatePageTitle()
{
	Log.info("Validate Hotels Search Page title");
	Assert.assertEquals(driver.getTitle(),"PHPTRAVELS");
	//Assert.assertEquals(driver.getTitle(),"Search Hotels - PHPTRAVELS");
}

@Test(priority=0,groups={"Regression"})
public void validateHotelsMenu()
{
	
	HomePage h=new HomePage(driver);

	String actualHotelText=h.hotels().getText();
	Log.info("Retrived Hotels text");
	
	Assert.assertEquals(actualHotelText,"HOTELS");
	Log.info("Validated that Hotels menu is present");
	
}

@Test(priority=1,groups={"Regression","Smoke"})
public void validateFlightsMenu()
{
	
	HomePage h=new HomePage(driver);

	String actualFlightsText=h.flights().getText();
	Log.info("Retrived Flights text");
	
	Assert.assertEquals(actualFlightsText,"FLIGHTS");
	Log.info("Validated that Flights menu is present");
	
	
}

@Test(priority=2,groups= {"Smoke"})
public void validateBritishAirways() throws Exception
{
	try {
	HomePage h=new HomePage(driver);

	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView();", h.britishAirwaysWebelement());
	
	//Assert.assertTrue(false);
	fluentWait(h.britishAirwaysWebelement());
	Assert.assertTrue(h.britishAirwaysWebelement().isDisplayed());
	Log.info("Validated that British Airways logo is displayed");
	Thread.sleep(2000);
	}
	
	catch(NoSuchElementException e)
	{
		Log.info(e.getMessage());
	}
	
}

@Test(priority=3,groups= {"Smoke"})
public void validate3rdCarosolCard() throws Exception
{
	
	HomePage h=new HomePage(driver);

	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView();", h.carosolCard3rd());
	
	fluentWait(h.carosolCard3rd());
	Assert.assertEquals(h.carosolCard3rd().getText(),"Islamabad");
	Log.info("Validated that Carosol 3rd card text");
	Thread.sleep(2000);
	
}

@Test(priority=4,groups= {"Smoke"})
public void validateMouseActions() throws Exception
{
	HomePage hp=new HomePage(driver);
	Actions action=new Actions(driver);
	action.moveToElement(hp.visaTab()).build().perform();
	Thread.sleep(5000);
	action.moveToElement(hp.visaTab()).contextClick().build().perform();
	//action.dragAndDrop(hp.visaTab(), hp.visaTab()).build().perform();
	
	Thread.sleep(5000);
}



@Test(priority=4,enabled=false)
public void playWithWindows() throws Exception
{
	String parentWindowHandle=driver.getWindowHandle();
	Set<String> allWindowHandles=driver.getWindowHandles();
	
	Iterator<String> handles=allWindowHandles.iterator();
	
	while(handles.hasNext())
	{

		if(!handles.next().equals(parentWindowHandle)) 
		{
			driver.switchTo().window(handles.next());
			System.out.print(driver.getTitle());
		}
	}
	
	driver.switchTo().window(parentWindowHandle);
	
	
	List<WebElement>allElements=driver.findElements(By.xpath(""));
	
	if(!allElements.isEmpty())
	{
		driver.findElement(By.xpath("")).isDisplayed();
	}
	for(int i=0;i<allElements.size();i++)
	{
		
	}
}




	
}
