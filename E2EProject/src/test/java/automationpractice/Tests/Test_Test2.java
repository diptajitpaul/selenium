package automationpractice.Tests;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import automationpractice.Base.Base;
import automationpractice.PageObjects.PO_HomePage;
import automationpractice.PageObjects.PO_QAClickAcademy;

public class Test_Test2 extends Base {
	
@Test(priority=1)
public void switchWindow() throws Exception         
{
	PO_HomePage hp=new 	PO_HomePage(driver);
hp.openWindowButton().click();

Thread.sleep(3000);
PO_QAClickAcademy qaca=	new PO_QAClickAcademy(driver);
String parentWindow=driver.getWindowHandle();
Set allWindows=driver.getWindowHandles();

Iterator<String> s=allWindows.iterator();

while(s.hasNext())
{

String childWindow=s.next();
//driver.switchTo().window(childWindow);
String childWindowPageTitile=driver.switchTo().window(childWindow).getTitle();

if(childWindowPageTitile.contentEquals("QAClick Academy - A Testing Academy to Learn, Earn and Shine"))
{
WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
wait.until(ExpectedConditions.visibilityOf(qaca.menu_course()));
SoftAssert sa=new SoftAssert();
//sa.assertEquals(qaca.menu_course().getText(), "COURSEC");
//Assert.(qaca.menu_course().getText(), "COURSEC", "Actual is "+qaca.menu_course().getText()+",but expected is COURSEC");
sa.assertEquals(qaca.menu_course().getText().equalsIgnoreCase("COURSEC"),"Actual is "+qaca.menu_course().getText()+",but expected is COURSEC");
break;
}




}

driver.switchTo().window(parentWindow);
//Thread.sleep(2000);
}

@Test(priority=2)	
public void selectcheckBox2()
{
	driver.switchTo().defaultContent();
	PO_HomePage hp=new 	PO_HomePage(driver);
	hp.checkbox2().click();
	
	FluentWait fluentWait=new FluentWait(driver);
	fluentWait.pollingEvery(Duration.ofSeconds(5));
	fluentWait.until(ExpectedConditions.visibilityOf(hp.checkbox2()));
	fluentWait.withTimeout(Duration.ofSeconds(20));
}

@Test(priority=3)	
public void enterTextInSwitchToAlert() throws Exception
{
	driver.switchTo().defaultContent();
	PO_HomePage hp=new 	PO_HomePage(driver);
	hp.switchtoalertexample().sendKeys("Diptajit Paul");
	Thread.sleep(2000);
	Assert.assertEquals(hp.switchtoalertexample().getAttribute("value"), "Diptajit Paul");
}

}
