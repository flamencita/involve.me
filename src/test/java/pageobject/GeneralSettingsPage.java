package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.qameta.allure.Step;

public class GeneralSettingsPage extends BasePage{

	@FindBy(css=".md\\:px-10 > button > span")
	private WebElement publishBtn;

	public GeneralSettingsPage(WebDriver driver) {
		super(driver);
	}
	/**
	 * Clicks the ready to publish button
	 */
	@Step("Click on 'Ready to publish' button")
	public void readyToPublishBtn() {
		click(publishBtn);
	}
}
