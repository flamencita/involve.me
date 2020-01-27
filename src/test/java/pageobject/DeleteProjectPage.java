package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import io.qameta.allure.Step;

public class DeleteProjectPage extends BasePage{
	//Delete button
	@FindBy(css="#confirm-delete-button")
	private WebElement deleteBtn;

	public DeleteProjectPage(WebDriver driver) {
		super(driver);
	}
	/**
	 * Clicks the delete project button
	 */
	@Step("Click the delete button")
	public void deleteProjectButton() {
		click(deleteBtn);
	}
}
