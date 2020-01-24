package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import pageobject.DeleteProjectPage;
import pageobject.HomePage;
import pageobject.LoginPage;
import pageobject.ProjectsPage;

public class DeleteProjectTest extends BaseTest {

	@Test
	public void deleteProject() {
		HomePage hp=new HomePage(driver);
		hp.openLoginPage();
		LoginPage lp=new LoginPage(driver);
		lp.login("info.flamencita@gmail.com", "Salom1984");
		ProjectsPage pp=new ProjectsPage(driver);
		pp.deleteProject("New Project");
		DeleteProjectPage dpp=new DeleteProjectPage(driver);
		dpp.deleleProject();
		int expected=pp.getProjectCount();
		assertEquals(expected-1, expected);
	}
}
