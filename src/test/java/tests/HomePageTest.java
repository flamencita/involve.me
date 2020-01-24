package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pageobject.HomePage;
import pageobject.RegistrationPage;

public class HomePageTest extends BaseTest{
	
	@Severity(SeverityLevel.MINOR)
	@Description("In this test the user fill in email and navigate to registration page")
	@Test
	public void getStartedforFree() {
		
		HomePage hp=new HomePage(driver);
		hp.getStarted("mayatest11@gmail.com");
		RegistrationPage rp=new RegistrationPage(driver);
		String expected=rp.getEmailText();
		assertEquals("mayatest11@gmail.com", expected);
	}
}
