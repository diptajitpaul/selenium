package PHPTravels.Tests;
import PHPTravels.Base.Base;
import PHPTravels.PageObjects.FlightSearchResult;
import PHPTravels.PageObjects.Home;
import PHPTravels.Resources.Log;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test_flightSearch extends Base {


public WebDriver driver;
@BeforeTest
public void getDriver()
{
	driver=super.driver;
}

@Test
public void flightSearch() throws IOException,InterruptedException
{
	
	Home h=new Home(driver);
	h.popupCloseButton().click();
	Log.info("Popup close button clicked");
	h.fromCity().click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[placeholder='From']")).sendKeys("Kolkata");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("ul[role='listbox']>li:nth-child(1)")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[placeholder='To']")).sendKeys("Delhi");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("ul[role='listbox']>li:nth-child(1)")).click();
	
	h.departureDate().click();
	
	h.searchButton().click();
	
	FlightSearchResult fsr= new FlightSearchResult(driver);
	fsr.closeButtonPopUp().click();
	String flightSerachResTitle=fsr.flightResultTitle().getText();
	boolean res=flightSerachResTitle.contains("Flights from");
	Assert.assertTrue(res);
	
}
	
}
