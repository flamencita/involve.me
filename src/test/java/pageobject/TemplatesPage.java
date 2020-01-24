package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TemplatesPage extends BasePage{

	@FindBy(css=" tr:nth-child(1) > td:nth-child(1) a > img")
	private WebElement blankBtn;
	
	public TemplatesPage(WebDriver driver) {
		super(driver);
	}
	/**
	 * Selecting blank project to create
	 */
	public void openBlankProject() {
		sleep(3000);
		click(blankBtn);
		sleep(3000);
	}

}
