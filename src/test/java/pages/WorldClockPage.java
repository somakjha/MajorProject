package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorldClockPage {

	@FindBy(id = "i0116")
	WebElement emailLocator;

	WebDriver driver = null;

	public WorldClockPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void openPage(String url) {
		driver.get(url);
	}

	public void enterEmail(String data) {
		emailLocator.sendKeys(data);
	}
}
