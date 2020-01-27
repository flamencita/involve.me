package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pageobject.AnalyticsPage;
import pageobject.HomePage;
import pageobject.LoginPage;
import pageobject.MainPage;

public class AnalyticsTest extends BaseTest{

	@Severity(SeverityLevel.NORMAL)
	@Description("Analyzing how many projects exist in the relevant account/Url")
	@Test
	public void t01_analyzeProjects() {
		
		HomePage hp=new HomePage(driver);
		hp.openLoginPage();
		LoginPage lp=new LoginPage(driver);
		lp.login("info.flamencita@gmail.com", "Salom1984");
		MainPage mp= new MainPage(driver);
		int expected=mp.getTotalProjects();
		mp.selectTab("Analytics");
		AnalyticsPage ap=new AnalyticsPage(driver);
		int actual=ap.getProjectsNum();
		assertEquals(actual, expected);
	}
	@Severity(SeverityLevel.NORMAL)
	@Description("Analyzing how many published projects exist in the relevant account/Url")
	@Test
	public void t02_analyzePublished() {
		HomePage hp=new HomePage(driver);
		hp.openLoginPage();
		LoginPage lp=new LoginPage(driver);
		lp.login("info.flamencita@gmail.com", "Salom1984");
		MainPage mp= new MainPage(driver);
		mp.allProjectsCounters("Published");
		int expected=mp.totalPublished();
		mp.selectTab("Analytics");
		AnalyticsPage ap=new AnalyticsPage(driver);
		int actual=ap.getTotalPublished();
		assertEquals(actual, expected);
	}
}
