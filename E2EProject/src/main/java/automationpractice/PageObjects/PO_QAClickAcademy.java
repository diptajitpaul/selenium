package automationpractice.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PO_QAClickAcademy {
	
	WebDriver driver;
	public PO_QAClickAcademy(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath=".//div[contains(@class,'sub-menu-bar')]/ul/li[2]/a")
	WebElement menu_course;
	
	public WebElement menu_course()
	{
		return menu_course;
	}
}
