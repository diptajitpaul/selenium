package PHPTravels.Tests;
import PHPTravels.Base.Base;
import PHPTravels.PageObjects.Home;
import PHPTravels.Resources.ExcelReader;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class test_forDebugging extends Base {

	public WebDriver driver;
	@BeforeTest
	public void getDriver()
	{
		driver=super.driver;
	}
	
@Test
public void debug() throws IOException
{
	int iteration=3;
	
	for(int i=0;i<iteration-1;i++) {
		List<String> excelValues=ExcelReader.readExcel(i+1);
		System.out.println(excelValues.get(i));
		System.out.println(excelValues.get(i+1));
	}
	
	
	System.out.println();
	
}
}