package PHPTravels.Tests;
import PHPTravels.Base.Base;
import PHPTravels.PageObjects.DashboardPage;
import PHPTravels.PageObjects.FlightSearchResult;
import PHPTravels.PageObjects.Home;
import PHPTravels.PageObjects.HomePage;
import PHPTravels.PageObjects.HotelSearchResultPage;
import PHPTravels.PageObjects.Hotels;
import PHPTravels.PageObjects.LoginPage;
import PHPTravels.Resources.Log;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class test_checkLogin extends Base {

	 

@Test(enabled=true,dataProvider="getData",groups= {"Regression"})
public void checkLogin(String username,String password) throws Exception
{
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	HomePage hp=new HomePage(driver);
	wait.until(ExpectedConditions.visibilityOf(hp.accountButton()));
	hp.accountButton().click();
	hp.customerLogin().click();
	
	LoginPage lp=new LoginPage(driver);
	
	wait.until(ExpectedConditions.visibilityOf(lp.loginText()));
	
	lp.email().sendKeys(username);
	lp.password().sendKeys(password);
	wait.until(ExpectedConditions.visibilityOf(lp.loginButton()));
	lp.loginButton().click();
	
	if((driver.findElements(By.cssSelector("div.message div[class='alert alert-danger failed']"))).size() != 0)
	{
		System.out.println("Credentials not correct");
	}
	
	DashboardPage dp=new DashboardPage(driver);
	wait.until(ExpectedConditions.visibilityOf(dp.welcomeText()));	

	Assert.assertTrue(dp.welcomeText().getText().contains("Welcome"));

	dp.account().click();
	dp.logout().click();
	driver.get("https://phptravels.net/");
	
	
	
}

@DataProvider
public Object[][] getData()
{
	return new Object[][] {{"user@phptravels.com","demouser"},{"abcd@phptravels.com","abcd"},{"user@phptravels.com","demouser"}};
}


	
}
