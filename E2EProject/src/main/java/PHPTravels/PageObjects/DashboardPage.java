package PHPTravels.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class DashboardPage {
	
	WebDriver driver;
	
	public DashboardPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public By welcomeTextWebElement=By.xpath("//div[@class='section-heading']/h2");
	By accountButtonWebEle=By.cssSelector("button#currency[type='button'][class='btn btn-primary dropdown-toggle waves-effect']");
	By logoutButtonWebEle=By.xpath("//*[@id=\"fadein\"]/header/div/div/div/div/div/div[2]/div/div[2]/div[3]/div/ul/li[5]/a");
	
	
	public WebElement welcomeText()
	{
		return driver.findElement(welcomeTextWebElement);
	}
	
	public WebElement account()
	{
		return driver.findElement(accountButtonWebEle);
	}
	
	
	public WebElement logout()
	{
		return driver.findElement(logoutButtonWebEle);
	}
	

}
