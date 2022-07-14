package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class WorldClockPage {

	WebDriver driver = null;
	
	public WorldClockPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	public void openPage(String url) {
		driver.get(url);
	}
}
