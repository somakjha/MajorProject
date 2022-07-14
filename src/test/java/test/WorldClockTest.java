package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import handler.BrowserHandler;
import pages.WorldClockPage;
import reader.PropertiesReader;

public class WorldClockTest {
	
	WebDriver driver = BrowserHandler.getWebDriver();
	WorldClockPage wcp = new WorldClockPage(driver);
	PropertiesReader propReader = new PropertiesReader();
	
	@Test()
	public void openPage() {
		wcp.openPage(propReader.fetchProperty("url"));
	}

}
