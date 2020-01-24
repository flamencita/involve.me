package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PublishNowPage extends BasePage{

	@FindBy(css="#confirm-publish-button")
	private WebElement publishNowBtn;
	@FindBy(css="#confirm-publish-button>span")
	private WebElement publishAnywayBtn;

	public PublishNowPage(WebDriver driver) {
		super(driver);
	}
	/**
	 * This will publish the project
	 */
	public void publishNow() {
		click(publishNowBtn);
		click(publishAnywayBtn);
	}
}
