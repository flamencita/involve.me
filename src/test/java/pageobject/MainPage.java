package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
	@FindBy(css="li.nav-item.active > a")
	private WebElement analyticsTab;
	
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
	public void openPlansBilling() {
		click(upgradeButton);
	}
	/**
	 * Clicks on 'Analytics' tab
	 */
	public void openAnalytics() {
		click(analyticsTab);
	}
	
}
