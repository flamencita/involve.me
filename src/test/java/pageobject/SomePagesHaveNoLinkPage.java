package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SomePagesHaveNoLinkPage extends BasePage{

	@FindBy(css=".swal-button.swal-button--publishErr")
	private WebElement publishAnywayBtn;

	public SomePagesHaveNoLinkPage(WebDriver driver) {
		super(driver);
	}
	/**
	 * This will publish the project even when is empty
	 */
	public void publishAnywayBtn() {
		click(publishAnywayBtn);
	}
}
