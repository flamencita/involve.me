package pageobject;

import org.openqa.selenium.WebDriver;

public class PlansPage extends BasePage{

	public PlansPage(WebDriver driver) {
		super(driver);
	}
	/**
	 * Returns plans page url
	 * @return
	 */
	public String getPlanUrl() {
		String url=driver.getCurrentUrl();
		return url;
	}

}
