package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FillInYourPersonalDetailsPage extends BasePage {

	@FindBy(css=".content-item-wrapper.shadow .c-data-collection-container")
	private WebElement firstNameField;
	@FindBy(css="")
	private WebElement lastNameField;
	@FindBy(css="")
	private WebElement emailField;
	@FindBy(css="")
	private WebElement nextBtn;
	@FindBy(css="")
	private WebElement subscribeCheckbox;
	@FindBy(css="")
	private WebElement iAgreeCheckbox;
	
	public FillInYourPersonalDetailsPage(WebDriver driver) {
		super(driver);
	}
	/**
	 * This method fills in details and 
	 * @param firstName
	 * @param lastName
	 * @param email
	 */
	public void fillInDetails(String firstName,String lastName,String email) {
		fillText(firstNameField, firstName);
		fillText(lastNameField, lastName);
		fillText(emailField, email);
		sleep(2000);
		click(nextBtn);
	}
}
