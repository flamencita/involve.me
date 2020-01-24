package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pageobject.HomePage;
import pageobject.LoginPage;
import pageobject.MainPage;
import pageobject.YourAccountPage;
import utilities.AllureAttachment;

public class ChangePasswordTest extends BaseTest{

	@Severity(SeverityLevel.NORMAL)
	@Description("This test shows if change password works")
	@Test (enabled=true, description="Succeed,")
	public void changePassword() throws InterruptedException {
		
		HomePage hp=new HomePage(driver);
		hp.openLoginPage();
		LoginPage lp=new LoginPage(driver);
		lp.login("info.flamencita@gmail.com", "Salom1984");
		MainPage mp=new MainPage(driver);
		mp.selectYourAccount();
		YourAccountPage yap=new YourAccountPage(driver);
		yap.changePassword("Salom1984", "Salom1984", "Salom1984");
		String expected=yap.getPassUpdatedMsg();
		assertEquals("Password successfully updated.", expected);
		AllureAttachment.addTextAttachment("Maya Rules");
	}
}
