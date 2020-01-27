package pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.qameta.allure.Step;

public class MainPage extends BasePage {

	@FindBy(css = "#nav-dropdown div:nth-child(2) > div.flex")
	private WebElement accountName;
	@FindBy(css="#nav-dropdown")
	private WebElement openMenuAccount;
	@FindBy(css="#app>div:nth-child(2) li:nth-child(2)>a")
	private WebElement yourAccountBtn;
	@FindBy(css="div:nth-child(2) > li:nth-child(1) > a")
	private WebElement changeOrganizationBtn;
	@FindBy(css=".nav-link.upgrade")
	private WebElement upgradeButton;
	@FindBy(css=".text-sm.flex.items-start>a")
	private List <WebElement> tabList;
	@FindBy(css="div.px-4.md\\:flex.justify-between.items-center > a")
	private WebElement createProjectBtn;
	@FindBy(css=".px-5.flex.justify-between.text-base > :nth-child(2)")
	private WebElement numOfProjects;
	@FindBy(css="a.mr-4.px-1.hover\\:text-teal-600")
	private WebElement numOfPublished;
	@FindBy(css=" ul > li:nth-child(12) > a")
	private WebElement loOutBtn;
	@FindBy(css="overflow-auto")
	private List <WebElement> typeList;

	public MainPage(WebDriver driver) {
		super(driver);
	}
	/**
	 * Returns the user name 
	 * @return
	 */
	public String getUserName() {
		return accountName.getText();
	}
	/**
	 * Clicks drop down list from account name and selecting "Your account" button
	 */
	public void selectYourAccount() {
		click(openMenuAccount);
		sleep(2000);
		click(yourAccountBtn);
	}
	/**
	 * This will choose the relevant tb between the five tabs
	 */
	@Step("Select any tab")
	public void selectTab(String tabName) {
		for (WebElement el : tabList) {
			if (el.getText().equalsIgnoreCase(tabName)) {
				el.click();
				break;
			}
		}
	}
	/**
	 * This method clicks drop down list from user account menu and clicks selecting change organization"
	 */
	public void changeOrganization() {
		click(openMenuAccount);
		sleep(5000);
		click(changeOrganizationBtn);
		sleep(20000);
	}
	/**
	 * Clicks on 'Upgrade' button
	 */
	public void upgradeAccount() {
		click(upgradeButton);
	}
	/**
	 * Clicks 'Create Project' button 
	 */
	public void createProject() {
		click(createProjectBtn);
	}
	/**
	 * Returns number of projects
	 * @return
	 */
	public int getTotalProjects() {
		sleep(5000);
		return Integer.parseInt(getText(numOfProjects));
	}

	public void allProjectsCounters(String type) {
		for (WebElement el : typeList) {
			if(el.getText().equalsIgnoreCase(type)) {
				sleep(4000);
				el.click();
			}
		}
	}
	
	public int totalPublished() {
		sleep(4000);
		return Integer.parseInt(getText(numOfPublished).replaceAll("[^0-9]", ""));
	}


	/**
	 * Logs out from account
	 */
	public void logOut() {
		sleep(8000);
		click(openMenuAccount);
		sleep(8000);
		click(loOutBtn);
	}
}
