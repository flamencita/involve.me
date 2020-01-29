package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pageobject.HomePage;
import pageobject.LoginPage;
import pageobject.ProjectsPage;
import utilities.AllureAttachment;

public class SearchProjectTest extends BaseTest{
	
	@Severity(SeverityLevel.NORMAL)
	@Description("This test we are search for the relevant project by click on magnifying glass and write the project name")
	@Test
	public void searchProject() {
		
		HomePage hp=new HomePage(driver);
		hp.openLoginPage();
		LoginPage lp=new LoginPage(driver);
		lp.login("info.flamencita@gmail.com", "Salom1984");
		ProjectsPage pp=new ProjectsPage(driver);
		pp.findProject("First");
		String expected=pp.getProjectName();
		assertEquals("First", expected);
		AllureAttachment.addTextAttachment("Maya Rules");
	}
}
