package pageobject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AnalyticsPage extends BasePage{

	@FindBy(css="div:nth-child(1) > div > div.stat-number.count")
	private WebElement projectCounter;
	@FindBy(css=" div > div:nth-child(2) > div >.stat-number.count")
	private WebElement numOfPublished;

	public AnalyticsPage(WebDriver driver) {
		super(driver);
	}
	/**
	 * Gets the number of projects
	 * @return
	 */
	public int getProjectsNum() {
		sleep(5000);
		return Integer.parseInt(getText(projectCounter));
	}
	/**
	 * returns the number of published projects
	 * @return
	 */
	public int getTotalPublished() {
		sleep(5000);
		return Integer.parseInt(getText(numOfPublished).replaceAll("[^0-9]", ""));
	}
}