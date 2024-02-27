package PHPTravels.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	By loginTextWebElement=By.cssSelector("div h5[class='modal-title title']");
	By emailWebElement=By.cssSelector("div.form-group input[class='form-control'][type='email']");
	By passwordWebElement=By.cssSelector("div.form-group.mb-2 input[class='form-control'][type='password']");
	By loginButtonWebElement=By.cssSelector("button[type='submit'][class='btn btn-default btn-lg btn-block effect ladda-button waves-effect']");
	
	public WebElement loginButton()
	{
		return driver.findElement(loginButtonWebElement);
	}
	
	public WebElement loginText()
	{
		return driver.findElement(loginTextWebElement);
	}
	public WebElement email()
	{
		return driver.findElement(emailWebElement);
	}
	public WebElement password()
	{
		return driver.findElement(passwordWebElement);
	}
	

}
