package MakeMyTrip.Tests;
import MakeMyTrip.Base.Base;
import MakeMyTrip.PageObjects.Home;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class test_dataProviderTest extends Base {


public WebDriver driver;
Home h;
int i=1;
@BeforeTest
public void getDriver1()
{
	driver=super.driver;
	h=new Home(driver);
	h.popupCloseButton().click();

}


@Test(priority=1,dataProvider="getData")
public void testMultiData(String fromCity,String toCity) throws InterruptedException
{
	
	h.fromCity().click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[placeholder='From']")).sendKeys(fromCity);
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("ul[role='listbox']>li:nth-child(1)")).click();
	Thread.sleep(2000);

	if(driver.findElements(By.cssSelector("label[for='toCity']")).size()!=0)
	{
		if(i>1)
		{
		h.toCity().click();
		
		}
		i++;	
	}
	driver.findElement(By.cssSelector("input[placeholder='To']")).sendKeys(toCity);
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("ul[role='listbox']>li:nth-child(1)")).click();
	Thread.sleep(2000);
}

@Test(priority=2,dataProvider="getDataFromHashMap")
public void testMultiData(HashMap <String,String> input) throws InterruptedException
{
	
	h.fromCity().click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[placeholder='From']")).sendKeys(input.get("fromCity"));
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("ul[role='listbox']>li:nth-child(1)")).click();
	Thread.sleep(2000);

	if(driver.findElements(By.cssSelector("label[for='toCity']")).size()!=0)
	{
		if(i>1)
		{
		h.toCity().click();
		
		}
		i++;	
	}
	driver.findElement(By.cssSelector("input[placeholder='To']")).sendKeys(input.get("toCity"));
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("ul[role='listbox']>li:nth-child(1)")).click();
	Thread.sleep(2000);
}


@DataProvider
public Object[][] getData()
{
	return new Object[][] {{"Kolkata","Delhi"},{"Mumbai","Kolkata"},{"Delhi","Mumbai"}};
}

@DataProvider
public Object[][] getDataFromHashMap()
{
	HashMap <String,String> map=new HashMap <String,String>();
	map.put("fromCity", "Kolkata");
	map.put("toCity", "Delhi");
	
	HashMap <String,String> map1=new HashMap <String,String>();
	map1.put("fromCity", "Mumbai");
	map1.put("toCity", "Kolkata");
	
	HashMap <String,String> map2=new HashMap <String,String>();
	map2.put("fromCity", "Delhi");
	map2.put("toCity", "Mumbai");
	
	return new Object[][] {{map},{map1},{map2}};
}
	
}
