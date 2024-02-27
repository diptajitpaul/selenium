package automationpractice.StepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import automationpractice.Base.Base;
import automationpractice.PageObjects.PO_HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class AP_StepDefinition extends Base {

	public WebDriver driver;

	@Given("I want to launch the browser and open the homepage of the application")
	public void initialiseTest() throws IOException
	{
		initializeDriver();
		this.driver=super.driver;
		
	}
	
@When("I click on Radiobutton2")
public void I_click_on_Radiobutton2()
{
	this.driver=super.driver;
	PO_HomePage hp=new PO_HomePage(driver);
	hp.radioButton2().click();
}

@Given("I want to close browser")
public void closeBrowser() throws Exception
{
	driver.quit();
}

	

}
