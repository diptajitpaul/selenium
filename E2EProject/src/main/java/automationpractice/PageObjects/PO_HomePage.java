package automationpractice.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PO_HomePage {
	WebDriver driver;
	public PO_HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver, this);
	}
  
	
	@FindBy(css="div[class*='large-row-spacer']:nth-of-type(1)>div#radio-btn-example>fieldset>label[for='radio1']>input")
	private WebElement radio1;
	
	@FindBy(css="div[class*='large-row-spacer']:nth-of-type(1)>div#radio-btn-example>fieldset>label[for='radio2']>input")
	private WebElement radio2;
	
	@FindBy(xpath="//div[contains(@class,'large-row-spacer')][1]/div[@id='radio-btn-example']/fieldset/label[@for='radio3']/input")
	private WebElement radio3;
	
	
	@FindBy(xpath=".//div[@class='cen-left-align']/fieldset/input[@type='text']")
	private WebElement suggestionClass;
	
	
	
	@FindBy(id="checkBoxOption1")
	WebElement checkbox1;
	
	@FindBy(id="checkBoxOption2")
	WebElement checkbox2;
	
	@FindBy(id="checkBoxOption3")
	WebElement checkbox3;
	
	@FindBy(id="dropdown-class-example")
	WebElement dropdown;
	
	@FindBy(id="openwindow")
	WebElement openWindowButton;
	
	@FindBy(id="name")
	WebElement switchtoalert;
	
	public WebElement switchtoalertexample()
	{
		return switchtoalert;
	}	
	
	public WebElement openWindowButton()
	{
		return openWindowButton;
	}
	public WebElement checkbox1()
	{
		return checkbox1;
	}
	
	public WebElement checkbox2()
	{
		return checkbox2;
	}
	
	public WebElement checkbox3()
	{
		return checkbox3;
	}
	
	public WebElement suggestionTextBox()
	{
		return suggestionClass;
	}
	
	public WebElement radioButton1()
	{
		return radio1;
	}
	
	public WebElement radioButton2()
	{
		return radio2;
	}
	
	public WebElement radioButton3()
	{
		return radio3;
	}
	
	public void selectDropDown(String visibleText) {
	
	Select sel=new Select(dropdown);
	sel.selectByVisibleText(visibleText);
	
	}
	
	
	
	

	
}
