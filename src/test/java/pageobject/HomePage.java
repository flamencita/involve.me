package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.qameta.allure.Step;

public class HomePage extends BasePage{

	@FindBy (css=".login")
	private WebElement loginLink;
	@FindBy (css="a.other-link.register")
	private WebElement registerLink;
	@FindBy (css="#banner input[type=email]")
	private WebElement emailField;
	@FindBy (css="#email-filled-button-001")
	private WebElement getStartedButton;
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	/**
	 * Clicks the login link to open the login page
	 */
	@Step("Open Home Page and click the Login link")
	public void openLoginPage() {
		click(loginLink);
	}	
	/**
	 * Clicks the register link to open the registration page
	 */
	@Step("Open Home Page and click the register link")
	public void openRegisterPage() {
		click(registerLink);
	}	
	/**
	 * The users needs to enter the email that navigate to registration page
	 * @param email
	 */
	@Step("Enetr you email and click on 'Get Started Free' button")
	public void getStarted(String email) {
		fillText(emailField, email);
		click(getStartedButton);
	}
}


