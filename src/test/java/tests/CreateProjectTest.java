package tests;


import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pageobject.ChooseProjectTypePage;
import pageobject.EditorProjectPage;
import pageobject.HomePage;
import pageobject.LoginPage;
import pageobject.NewProjectNamePage;
import pageobject.ProjectsPage;
import pageobject.TemplatesPage;

public class CreateProjectTest extends BaseTest{
	
	@Severity(SeverityLevel.CRITICAL)
	@Description("This test creates a new project using quiz tample")
	@Test
	public void createNewProject() {

		HomePage hp=new HomePage(driver);
		hp.openLoginPage();
		LoginPage lp=new LoginPage(driver);
		lp.login("info.flamencita@gmail.com", "Salom1984");
		ProjectsPage pp=new ProjectsPage(driver);
		pp.createNewProject();
		ChooseProjectTypePage cptp=new ChooseProjectTypePage(driver);
		cptp.selectQuizProject();
		TemplatesPage tp=new TemplatesPage(driver);
		tp.openBlankProject();
		NewProjectNamePage npnp=new NewProjectNamePage(driver);
		npnp.namingProject("LLLL");
		EditorProjectPage epp=new EditorProjectPage(driver);
		//epp.dragFreeTextIcon();
		epp.dragContactInfoIcon();
		
//		EditorProjectPage epp=new EditorProjectPage(driver);
//		epp.publishButton();
//		SomePagesHaveNoLinkPage sphnlp= new SomePagesHaveNoLinkPage(driver);
//		sphnlp.publishAnywayBtn();
//		GeneralSettingsPage gsp=new GeneralSettingsPage(driver);
//		gsp.readyToPublishBtn();
//		PublishNowPage pnp=new PublishNowPage(driver);
//		pnp.publishNow();
	}
}
