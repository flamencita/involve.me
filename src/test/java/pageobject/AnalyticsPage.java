package pageobject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AnalyticsPage extends BasePage{

	@FindBy(css="div:nth-child(1) > div > div.stat-number.count")
	private WebElement projectCounter;
	@FindBy(css=" div > div:nth-child(2) > div >.stat-number.count")
	private WebElement publishedCounter;


	public AnalyticsPage(WebDriver driver) {
		super(driver);
	}
	/**
	 * Gets the number of projects
	 * @return
	 */
	public int getProjectsNum() {
		return Integer.parseInt(getText(projectCounter));
	}
	/**
	 * Gets the number of published projects
	 */
	public int getPublishedNum() {
		return Integer.parseInt(getText(publishedCounter));
	}
}