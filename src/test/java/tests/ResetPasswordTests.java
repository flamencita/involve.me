package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pageobject.HomePage;
import pageobject.LoginPage;
import pageobject.ResetPassPage;

public class ResetPasswordTests extends BaseTest {
	
	@Severity(SeverityLevel.MINOR)
	@Description("This test clicks on forgot password link and check if the reset email was sent")
	@Test
	public void resetPassword() {
		HomePage hp = new HomePage(driver);
		hp.openLoginPage();
		LoginPage lp = new LoginPage(driver);
		lp.forgotPass();
		ResetPassPage rpp = new ResetPassPage(driver);
		rpp.resetPass("info.flamencita@gmail.com");
		String expected=rpp.resetPassMsg();
		assertEquals("A reset link has been sent to the email address, if it has been used to register for an account.", expected);
	}
}
