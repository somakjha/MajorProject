package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import handler.BrowserHandler;
import pages.WorldClockPage;
import reader.ExcelReader;
import reader.PropertiesReader;

public class WorldClockTest {
	
	WebDriver driver = BrowserHandler.getWebDriver();
	WorldClockPage wcp = new WorldClockPage(driver);
	PropertiesReader propReader = new PropertiesReader();	

//	@Test(priority = 0)
//	public void openPage() {
//		wcp.openPage(propReader.fetchProperty("url"));
//	}
	@Test(priority = 1)
	public void enterEmail() throws Exception
	{
		//wcp.enterEmail("somak.jha@gmaiiil.com");
		System.out.println(ExcelReader.getDataFromExcel()[0]);
	}

}
