package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourAccountPage extends BasePage {

	@FindBy(css=".container div > div > div > ul > li:nth-child(3) > a")
	private WebElement changePasswordTab;
	@FindBy(css="[name='old_password']")
	private WebElement oldPasswordField;
	@FindBy(css="[name='password']")
	private WebElement newPasswordField;
	@FindBy(css="[name='password_confirmation']")
	private WebElement confirmPasswordField;
	@FindBy(css="#password  button")
	private WebElement updatePasswordBtn;
	@FindBy(css=".alert.alert-success")
	private WebElement passUpdateMsg;

	public YourAccountPage(WebDriver driver) {
		super(driver);
	}
	/**
	 * This will change the password
	 */
	public void changePassword(String old,String newPassword ,String confirmPassword) {
		click(changePasswordTab);
		sleep(3000);
		fillText(oldPasswordField, old);
		sleep(3000);
		fillText(newPasswordField, newPassword);
		sleep(3000);
		fillText(confirmPasswordField, confirmPassword);
		sleep(3000);
		click(updatePasswordBtn);
	}
	
	public String getPassUpdatedMsg() {
		return getText(passUpdateMsg);
	}
}
