package PHPTravels.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Hotels {
	
	WebDriver driver;
	
	public Hotels(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By scrollTo=By.cssSelector("div.makeFlex.blackText.latoBold.appendBottom20");
	By carousalWebElement=By.cssSelector("button.slick-arrow.slick-next");
	
	
	public WebElement scrollToElement()
	{
		return driver.findElement(scrollTo);
	}
	
	public WebElement carousal()
	{
		return driver.findElement(carousalWebElement);
	}
	

}
