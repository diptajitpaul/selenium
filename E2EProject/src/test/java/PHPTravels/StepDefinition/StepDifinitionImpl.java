package PHPTravels.StepDefinition;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PHPTravels.Base.Base;
import PHPTravels.PageObjects.HomePage;
import PHPTravels.Resources.Log;
import io.cucumber.java.en.*;

public class StepDifinitionImpl extends Base{
	
	WebDriver driver;
	
	@Given("I launched the PHPTravels application")
	public void I_launched_the_PHPTravels_application() throws IOException
	{
		this.driver=initializeDriver();
	}
	
	@Then("{string} is the page title")
	public void Validate_Page_Title()
	{
		Log.info("Validate Hotels Search Page title");
		Assert.assertEquals(driver.getTitle(),"PHPTRAVELS | Travel Technology Partner - PHPTRAVELS");
	}
	
	@Then("{string} hotels menu is present")
	public void Validate_Hotels_Menu()
	{
		HomePage h=new HomePage(driver);

		String actualHotelText=h.hotels().getText();
		Log.info("Retrived Hotels text");
		
		Assert.assertEquals(actualHotelText,"Hotels");
		Log.info("Validated that Hotels menu is present");
	}
	
	@Then("{string} flights menu is present")
	public void Validate_Flights_Menu()
	{
		HomePage h=new HomePage(driver);

		String actualFlightsText=h.flights().getText();
		Log.info("Retrived Flights text");
		
		Assert.assertEquals(actualFlightsText,"Flights");
		Log.info("Validated that Flights menu is present");
	}
	
	@When("I scroll down the page to the British Airways webelement")
	public void scroll_to_British_Airways()
	{
		HomePage h=new HomePage(driver);

		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", h.britishAirwaysWebelement());
	}
	
	@Then("British Airways card is present")
	public void British_Airways_card_is_present() throws Exception
	{
		HomePage h=new HomePage(driver);
		fluentWait(h.britishAirwaysWebelement());
		Assert.assertTrue(h.britishAirwaysWebelement().isDisplayed());
		Log.info("Validated that British Airways logo is displayed");
		Thread.sleep(2000);
	}
	
	@When("I scroll down to the 3rd Carosol Card")
	public void Scroll_to_3rd_Carosol_Card()
	{
		HomePage h=new HomePage(driver);

		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", h.carosolCard3rd());
	}
	
	@Then("{string} text is present in 3rd Carosol Card")
	public void Islamabad_text_is_present() throws Exception
	{
		HomePage h=new HomePage(driver);
		fluentWait(h.carosolCard3rd());
		Assert.assertEquals(h.carosolCard3rd().getText(),"Islamabad");
		Log.info("Validated that Carosol 3rd card text");
		Thread.sleep(2000);
	}
	
	@And("close the browser")
	public void close_browser()
	{
		driver.quit();
	}
	
	
	

}
