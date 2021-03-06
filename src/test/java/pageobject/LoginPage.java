package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import io.qameta.allure.Step;

public class LoginPage extends BasePage {
	// login
	@FindBy(css = "[name='email']")
	private WebElement emailLogin;
	@FindBy(css = "[name='password']")
	private WebElement passLogin;
	@FindBy(css = "[type='submit']")
	private WebElement loginBtn;
	@FindBy(css = "div > div.form-group > div")
	private WebElement invalidCredentialsMsg;
	@FindBy(css="div div:nth-child(2) > p > a")
	private WebElement createAccountLink;
	//Forgot password
	@FindBy(css = "div:nth-child(6) a")
	private WebElement forgotPassLink;

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	/**
	 * Login process
	 */
	@Step("Fill in email and password fields and click the login button")
	public void login(String email, String password) {
		sleep(2000);
		fillText(emailLogin, email);
		sleep(2000);
		fillText(passLogin, password);
		sleep(2000);
		click(loginBtn);
	}

	
	/**
	 * Clicks the forgot password link
	 */
	@Step("Click on forgot password link")
	public void forgotPass() {
		sleep(3000);
		click(forgotPassLink);
		sleep(3000);
	}
	/**
	 * Gets the message when user writes invalid credentials
	 * @return
	 */
	public String  getInvalidLoginMsg() {
		return invalidCredentialsMsg.getText();
	}
	/**
	 * Clicks create an account link
	 */
	@Step("Click on create an account link")
	public void openRegistration() {
		click(createAccountLink);
	}
	/**
	 * Gets login page url
	 * @return
	 */
	public String getLoginUrl() {
		String Url=driver.getCurrentUrl();
		return Url;
	}
}
