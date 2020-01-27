package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pageobject.ChooseProjectTypePage;
import pageobject.DeleteProjectPage;
import pageobject.HomePage;
import pageobject.LoginPage;
import pageobject.MainPage;
import pageobject.NewProjectNamePage;
import pageobject.ProjectsPage;
import pageobject.TemplatesPage;

public class DeleteProjectTest extends BaseTest {

	@Test
	public void deleteProjectTest() {
		HomePage hp=new HomePage(driver);
		hp.openLoginPage();
		LoginPage lp=new LoginPage(driver);
		lp.login("info.flamencita@gmail.com", "Salom1984");
		MainPage mp=new MainPage(driver);
		mp.createProject();
		ChooseProjectTypePage cpt=new ChooseProjectTypePage(driver);
		cpt.selectQuizProject();
		TemplatesPage tp=new TemplatesPage(driver);
		tp.openBlankProject();
		NewProjectNamePage npnp=new NewProjectNamePage(driver);
		npnp.namingProject("maya delete");
		int before=mp.getTotalProjects();
		ProjectsPage pp=new ProjectsPage(driver);
		pp.deleteProject("maya delete");
		pp.selectFromMenu("Delete Project");
		DeleteProjectPage dpp=new DeleteProjectPage(driver);
		dpp.deleteProjectButton();
		int after=mp.getTotalProjects();
		assertEquals(after, before - 1);
		
	}
}
