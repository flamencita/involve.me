package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pageobject.CreateNewWorkspacePage;
import pageobject.HomePage;
import pageobject.LoginPage;
import pageobject.ProjectsPage;

public class WorkspaceTest extends BaseTest {
	
	@Severity(SeverityLevel.NORMAL)
	@Description("This test checks if create workspace works")
	@Test(enabled=true,description="Succeeded creating a new workspace")
	public void T01_createNewWorkspace() {
		
		HomePage hp=new HomePage(driver);
		hp.openLoginPage();
		LoginPage lp=new LoginPage(driver);
		lp.login("info.flamencita@gmail.com", "Salom1984");
		ProjectsPage pp=new ProjectsPage(driver);
		pp.createWorkspaceIcon();
		int before = pp.getWorkspaceCount();
		CreateNewWorkspacePage cnwp=new CreateNewWorkspacePage(driver);
		cnwp.createNewWorkspace("hffhf");
		int after = pp.getWorkspaceCount();
		assertEquals(before+1, after+1);
	}
	
}
