package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {

	@FindBy(css = "#app-layout div:nth-child(4) p > a")
	private WebElement logInLink;

	@FindBy(css = "input[name='email']")
	private WebElement emailField;

	public RegistrationPage(WebDriver driver) {
		super(driver);
	}

	/**
	 * Gets registration page url
	 * 
	 * @return
	 */
	public String getRegistrationUrl() {
		String url = driver.getCurrentUrl();
		return url;
	}

	/**
	 * Clicks on Log in link
	 */
	public void openLoginPage() {
		click(logInLink);
	}

	/**
	 * Returns email text on registration page
	 * 
	 * @return
	 */
	public String getEmailText() {
		sleep(3000);
		return emailField.getAttribute("value");
	}
}
