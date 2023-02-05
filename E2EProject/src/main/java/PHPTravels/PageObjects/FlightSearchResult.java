package PHPTravels.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class FlightSearchResult {
	
	WebDriver driver;
	
	public FlightSearchResult(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	By flightSearchResultLabel=By.cssSelector("p.font24.blackFont.whiteText.appendBottom20.journey-title");
	By closeButtonPopUp=By.cssSelector(".bgProperties.icon20.overlayCrossIcon");
	
	
	public WebElement flightResultTitle()
	{
		return driver.findElement(flightSearchResultLabel);
	}
	
	public WebElement closeButtonPopUp()
	{
		return driver.findElement(closeButtonPopUp);
	}
	
	
	
	
	

}
