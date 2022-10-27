package MakeMyTrip.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Home {
	
	WebDriver driver;
	
	public Home(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By flightsMenu=By.cssSelector("ul.makeFlex.font12>li.menu_Flights>div>a");
	By hotelsMenu=By.cssSelector("ul.makeFlex.font12>li.menu_Hotels>div>a");
	By homestaysMenu=By.cssSelector("ul.makeFlex.font12>li.menu_Homestays>div>a");
	By holidaypackagesMenu=By.cssSelector("ul.makeFlex.font12>li.menu_Holidays>div>a");
	By trainsMenu=By.cssSelector("ul.makeFlex.font12>li.menu_Trains>div>a");
	By busesMenu=By.cssSelector("ul.makeFlex.font12>li.menu_Buses>div>a");
	By cabsMenu=By.cssSelector("ul.makeFlex.font12>li.menu_Cabs>div>a");
	By forexMenu=By.cssSelector("ul.makeFlex.font12>li.menu_Forex>div>a");
	By chartersMenu=By.cssSelector("ul.makeFlex.font12>li.menu_Charters>div>a");
	By activitiesMenu=By.cssSelector("ul.makeFlex.font12>li.menu_Activities>div>a");
	
	By popupclose=By.cssSelector(".langCardClose");
	By search= By.cssSelector("a.primaryBtn.font24.latoBold.widgetSearchBtn");
	By from=By.cssSelector("label[for='fromCity']");
	By to=By.cssSelector("label[for='toCity']");
	By departureDate=By.cssSelector(".DayPicker-Body[role='rowgroup']>div:nth-of-type(3)>div");
	
	By loginButton=By.cssSelector("li.makeFlex.hrtlCenter.userLoggedOut");
	By usernameField=By.cssSelector("div.modalFieldInner>input#username");
	By continueButton=By.cssSelector("button.capText");
	By passwordField=By.cssSelector("input#password");
	By login=By.cssSelector("div.btnContainer>button");
	
	public WebElement login()
	{
		return driver.findElement(login);
	}
	public WebElement passwordField()
	{
		return driver.findElement(passwordField);
	}
	
	
	public WebElement continueButton()
	{
		return driver.findElement(continueButton);
	}
	public WebElement usernameField()
	{
		return driver.findElement(usernameField);
	}
	
	public WebElement flightsMenu()
	{
		return driver.findElement(flightsMenu);
	}
	
	public WebElement hotelsMenu()
	{
		return driver.findElement(hotelsMenu);
	}
	
	public WebElement homestaysMenu()
	{
		return driver.findElement(homestaysMenu);
	}
	public WebElement holidaypackagesMenu()
	{
		return driver.findElement(holidaypackagesMenu);
	}
	public WebElement trainsMenu()
	{
		return driver.findElement(trainsMenu);
	}
	public WebElement busesMenu()
	{
		return driver.findElement(busesMenu);
	}
	public WebElement cabsMenu()
	{
		return driver.findElement(cabsMenu);
	}
	public WebElement forexMenu()
	{
		return driver.findElement(forexMenu);
	}
	
	public WebElement chartersMenu()
	{
		return driver.findElement(chartersMenu);
	}
	public WebElement activitiesMenu()
	{
		return driver.findElement(activitiesMenu);
	}
	
	
	public WebElement popupCloseButton()
	{
		return driver.findElement(popupclose);
	}
	public WebElement searchButton()
	{
		return driver.findElement(search);
	}
	
	public WebElement fromCity()
	{
		return driver.findElement(from);
	}
	
	public WebElement toCity()
	{
		return driver.findElement(to);
	}
	
	public WebElement departureDate()
	{
		return driver.findElement(departureDate);
	}
	
	public WebElement loginButton()
	{
		return driver.findElement(loginButton);
	}
	
	
	
	
	
	

}
