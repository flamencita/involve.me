package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pageobject.HomePage;
import pageobject.LoginPage;
import pageobject.ProjectsPage;
import utilities.AllureAttachment;

public class SearchProjectTest extends BaseTest{

	@Test
	public void searchProject() throws InterruptedException {
		
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
