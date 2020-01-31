package tests;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pageobject.HomePage;
import pageobject.LoginPage;
import pageobject.MainPage;
import pageobject.RegistrationPage;
import utilities.AllureAttachment;
import utilities.DataProviders;

public class LoginTest extends BaseTest {
	
	@Severity(SeverityLevel.BLOCKER)
	@Description("This login test is invalid login")
	@Test(description="Invalid login", dataProvider= "loginCradentils", dataProviderClass= DataProviders.class)
	public void Login01_loginInvalid() {
		
		HomePage hp = new HomePage(driver);
		hp.openLoginPage();
		LoginPage lp = new LoginPage(driver);
		lp.login("info@gneill.co", "Salom1984");
		String expected=lp.getInvalidLoginMsg();
		assertEquals("These credentials do not match our records.", expected);
		AllureAttachment.addTextAttachment("Getting exeption for unvalid credenails when user loged in");
	}
	
	@Description("This login test clicks the create an account link from login page")
	@Test
	public void Login02_loginCreateAccount() {
		LoginPage lp=new LoginPage(driver);
		lp.openRegistration();
		RegistrationPage rp=new RegistrationPage(driver);
		String expected=rp.getRegistrationUrl();
		assertEquals("https://app.involve.me/register", expected);	
		rp.openLoginPage();
	}
	
	@Severity(SeverityLevel.BLOCKER)
	@Description("This test is for seccessfull login process")
	@Test(description="Login succeeded")
	public void Login03_loginSucceed() {
		
		LoginPage lp = new LoginPage(driver);
		lp.login("info.flamencita@gmail.com", "Salom1984");
		MainPage mp=new MainPage(driver);
		String expected = mp.getUserName();
		assertEquals("TestMaya", expected);
		AllureAttachment.addTextAttachment("Seccessful login proccess");
	}
}
