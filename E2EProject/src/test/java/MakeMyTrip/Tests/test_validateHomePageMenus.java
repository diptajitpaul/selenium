package MakeMyTrip.Tests;
import MakeMyTrip.Base.Base;
import MakeMyTrip.PageObjects.Home;
import MakeMyTrip.Resources.Log;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class test_validateHomePageMenus extends Base{

public WebDriver driver;
public Home h;

@BeforeTest
public void getDriver()
{
	driver=super.driver;
}

@Test(priority=1)
public void validateFlightsMenu()
{
	h=new Home(driver);
	h.popupCloseButton().click();
	Log.info("Popup close button clicked");
	boolean flights=h.flightsMenu().getAttribute("href").equals("https://www.makemytrip.com/flights/");
	Assert.assertTrue(flights);
}

@Test(priority=2)
public void validateHotelsMenu()
{
	boolean hotels=h.hotelsMenu().getAttribute("href").equals("https://www.makemytrip.com/hotels/");
	Assert.assertTrue(hotels);
}

@Test(priority=3)
public void validateHolidayPackagesMenu()
{
	boolean holidayPackages=h.holidaypackagesMenu().getAttribute("href").equals("https://www.makemytrip.com/holidays-india/");
	Assert.assertTrue(holidayPackages);
}

@Test(priority=4)
public void validateTrainsMenu()
{
	boolean trains=h.trainsMenu().getAttribute("href").equals("https://www.makemytrip.com/railways/");
	Assert.assertTrue(trains);
}

@Test(priority=5)
public void validateBusesMenu()
{
	boolean buses=h.busesMenu().getAttribute("href").equals("https://www.makemytrip.com/bus-tickets/");
	Assert.assertTrue(buses);
}

@Test(priority=6)
public void validateCabsMenu()
{
	boolean cabs=h.cabsMenu().getAttribute("href").equals("https://www.makemytrip.com/cabs/");
	Assert.assertTrue(cabs);
}

@Test(priority=7)
public void validateForexMenu()
{
	boolean forex=h.forexMenu().getAttribute("href").equals("https://www.makemytrip.com/forex/");
	Assert.assertTrue(forex);
}

@Test(priority=8)
public void validateCharterFlightsMenu()
{
	boolean charterFlights=h.chartersMenu().getAttribute("href").equals("https://www.makemytrip.com/charter-flights/");
	Assert.assertTrue(charterFlights);
}

@Test(priority=9)
public void validateActivitiesMenu()
{
	boolean activities=h.activitiesMenu().getAttribute("href").equals("https://www.makemytrip.com/activities/");
	Assert.assertTrue(activities);
}
	
}
