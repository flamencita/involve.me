package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResetPassPage extends BasePage {

	@FindBy(css = ".form-control.e-zoom-input")
	private WebElement emailFeild;
	@FindBy(css = ".btn.btn-primary")
	private WebElement sendPassBtn;
	@FindBy(css = ".alert.alert-success")
	private WebElement resetMsg;

	public ResetPassPage(WebDriver driver) {
		super(driver);
	}
	/**
	 * Reset the password by sending email
	 */
	public void resetPass(String email) {
		fillText(emailFeild, email);
		click(sendPassBtn);
	}
	
	public String resetPassMsg() {
		return resetMsg.getText();
		
	}
}
