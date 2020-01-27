package tests;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pageobject.HomePage;
import pageobject.LoginPage;
import pageobject.MainPage;

public class OrganizationTest extends BaseTest{

	@Severity(SeverityLevel.NORMAL)
	@Description("This test case edit a new organization name")
	@Test(enabled=true,description="Succeeded edit organization")
	public void editOrganization() {
		
		HomePage hp=new HomePage(driver);
		hp.openLoginPage();
		LoginPage lp=new LoginPage(driver);
		lp.login("mayarozilio@gmail.com", "Salom1984");
		MainPage mp=new MainPage(driver);
		mp.changeOrganization();
		
	}
}
