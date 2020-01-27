package tests;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pageobject.HomePage;
import pageobject.LoginPage;
import pageobject.RegistrationPage;

public class RegistrationTest extends BaseTest{
	
	@Description("This test clicks on register link from Home page and go back to login page")
	@Severity(SeverityLevel.MINOR)
	@Test
	public void openLogin() {
		HomePage hp=new HomePage(driver);
		hp.openRegisterPage();
		RegistrationPage rp=new RegistrationPage(driver);
		rp.openLoginPage();
		LoginPage lp=new LoginPage(driver);
		String expected=lp.getLoginUrl();
		assertEquals("https://app.involve.me/login", expected);
	}
}
