package automationpractice.Tests;

import org.testng.annotations.Test;

import automationpractice.Base.Base;
import automationpractice.PageObjects.PO_HomePage;

public class Test_Test1 extends Base {


	@Test	
	public void selectRadioButton2()
	{
		PO_HomePage hp=new PO_HomePage(driver);
		hp.radioButton2().click();
	}


@Test	
public void enterTextinSuggestionBox()
{
	PO_HomePage hp=new PO_HomePage(driver);
	hp.suggestionTextBox().sendKeys("India");

}

@Test	
public void selectFromDropdown()
{
	PO_HomePage hp=new PO_HomePage(driver);
	hp.selectDropDown("Option3");

}

@Test	
public void select3rdCheckBox()
{
	PO_HomePage hp=new PO_HomePage(driver);
	hp.checkbox3().click();

}


}
