package PHPTravels.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	By hotelsMenu=By.cssSelector("ul#tab>li:nth-of-type(2)>button.nav-link.w-100.waves-effect>span");
	By flightsMenu=By.cssSelector("ul#tab>li:nth-of-type(1)>button.nav-link.w-100.waves-effect>span");
	By britishAirways=By.cssSelector("div.deal-title.d-flex.align-items-center>img[src='https://phptravels.net/api/uploads/images/flights/slider/rd28iqxqv808gk.png']");
	By carosolCard_3=By.cssSelector("body>section.hotel-area:nth-of-type(3)>div.container>div>div:nth-of-type(2) div div div div div div:nth-of-type(8) div p");
	By hotelCityWebelement=By.cssSelector("span.select2-selection__rendered");
	By fromDateWebelement=By.xpath("//div[@class='col-md-6']/div/input[@name='checkin' and @id='checkin']");
	By fromDateEle=By.xpath("//div[@class='datepicker dropdown-menu'][1]/div/table/tbody/tr[4]/td[4]");
	
	By searchButtonEle=By.cssSelector("div.btn-search.text-center>button[type='submit'][id='submit']");
	By toDateEle=By.xpath("//div[@class='datepicker dropdown-menu'][2]/div/table/tbody/tr[6]/td[7]");
	
	By accountButtonEle=By.cssSelector("button[class='btn btn-primary dropdown-toggle waves-effect']");
	By customerLoginEle=By.cssSelector("ul[class='dropdown-menu show'] li a");
	By visaTabWelEle=By.xpath("//ul[@id='Tab' and @role='tablist']/li[5]/button/span[2]");
	
	
	public WebElement visaTab()
	{
		return driver.findElement(visaTabWelEle);
	}
	public WebElement customerLogin()
	{
		return driver.findElement(customerLoginEle);
	}
	
	public WebElement accountButton()
	{
		return driver.findElement(accountButtonEle);
	}
	public WebElement searchButton()
	{
		return driver.findElement(searchButtonEle);
	}
	public WebElement toDate()
	{
		return driver.findElement(toDateEle);
	}
	
	public WebElement fromDate()
	{
		return driver.findElement(fromDateEle);
	}
	public WebElement fromDatePicker()
	{
		return driver.findElement(fromDateWebelement);
	}
	
	public WebElement hotels()
	{
		return driver.findElement(hotelsMenu);
	}
	public WebElement flights()
	{
		return driver.findElement(flightsMenu);
	}
	
	public WebElement britishAirwaysWebelement()
	{
		return driver.findElement(britishAirways);
	}
	
	public WebElement carosolCard3rd()
	{
		return driver.findElement(carosolCard_3);
	}	
	
	public WebElement hotelCity()
	{
		return driver.findElement(hotelCityWebelement);
	}
	
	
	
	
	
	
	
	

}


