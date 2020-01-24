package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GeneralSettingsPage extends BasePage{

	@FindBy(css=".md\\:px-10 > button > span")
	private WebElement publishBtn;

	public GeneralSettingsPage(WebDriver driver) {
		super(driver);
	}
	/**
	 * Clicks the ready to publish button
	 */
	public void readyToPublishBtn() {
		click(publishBtn);
	}
}
