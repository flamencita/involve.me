package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import pageobject.HomePage;
import pageobject.LoginPage;
import pageobject.ResetPassPage;

public class ResetPasswordTests extends BaseTest {

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
