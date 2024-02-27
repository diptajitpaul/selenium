package PHPTravels.Tests;
import PHPTravels.Base.Base;
import PHPTravels.PageObjects.FlightSearchResult;
import PHPTravels.PageObjects.Home;
import PHPTravels.PageObjects.HomePage;
import PHPTravels.PageObjects.HotelSearchResultPage;
import PHPTravels.PageObjects.Hotels;
import PHPTravels.Resources.Log;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test_validateHotelsPage extends Base {


@Test(groups= {"Smoke"})
public void searchHotel() throws Exception
{
	FluentWait fwait = new FluentWait(driver);
	fwait.withTimeout(Duration.ofSeconds(20));
	fwait.pollingEvery(Duration.ofSeconds(5));
	fwait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("preloader")));
	
	
	HomePage h=new HomePage(driver);
	h.hotelCity().click();
	driver.findElement(By.cssSelector("input.select2-search__field")).click();
	driver.findElement(By.cssSelector("input.select2-search__field")).sendKeys("Goa");
	
	List<WebElement> s=driver.findElements(By.cssSelector("span.select2-results"));
	if(s.size()!=0)
	{

	WebDriverWait wdwait=new WebDriverWait(driver, Duration.ofMillis(5000));
	wdwait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("span.select2-results>ul[class='select2-results__options'][id='select2-hotels_city-results'] li i")));
	List<WebElement> f=driver.findElements(By.cssSelector("span.select2-results>ul>li"));

	for(int i=1;i<f.size();i++)
	{
		String pa="span.select2-results>ul>li:nth-child("+i+")";
		if(driver.findElement(By.cssSelector(pa)).getText().contains("Goa"))
		{
			driver.findElement(By.cssSelector(pa)).click();
			break;
		}
		
	}
	
	}

    h.fromDatePicker().click();
    Thread.sleep(1000);
    
    h.fromDate().click();
    Log.info("Entered From Date");
    Thread.sleep(1000);
    h.toDate().click();
    Log.info("Entered To Date");
    Thread.sleep(1000);
    h.searchButton().click();
    Log.info("Clicked on Submit button");
    
    Thread.sleep(5000);
    HotelSearchResultPage hsr=new HotelSearchResultPage(driver);
    
    Assert.assertTrue(hsr.backtoSearch().isDisplayed(),"Hotel Search Result Page is not displayed");
    Log.info("Flight search result page is displayed");

	
}


	
}
