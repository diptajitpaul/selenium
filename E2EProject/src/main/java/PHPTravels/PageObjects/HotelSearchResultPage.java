package PHPTravels.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HotelSearchResultPage {
	
	WebDriver driver;
	
	public HotelSearchResultPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	By backtoSearchEle=By.xpath("//div[@class='text-center']/a");
	
	
	
	public WebElement backtoSearch()
	{
		return driver.findElement(backtoSearchEle);
	}
	

}
