package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pageobject.HomePage;
import pageobject.LoginPage;
import pageobject.MainPage;
import pageobject.PlansPage;
import utilities.AllureAttachment;

public class UpgradeAccountTest extends BaseTest{

	@Severity(SeverityLevel.NORMAL)
	@Description("This test case tests if by clicking on 'Upgrade' button it navigates to 'Plans/Billing' page")
	@Test
	public void upgradeYourAccount() {
		HomePage hp=new HomePage(driver);
		hp.openLoginPage();
		LoginPage lp=new LoginPage(driver);
		lp.login("info.flamencita@gmail.com", "Salom1984");
		MainPage mp=new MainPage(driver);
		mp.upgradeAccount();
		PlansPage pp=new PlansPage(driver);
		String expected=pp.getPlanUrl();
		assertEquals("https://app.involve.me/billing/plans", expected);
		AllureAttachment.addTextAttachment("");
	}
}
