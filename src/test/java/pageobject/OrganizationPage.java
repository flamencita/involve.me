package pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrganizationPage extends BasePage{


	@FindBy(css=".px-2.py-1")
	private WebElement editOrganizationBtn;
	@FindBy(css=".px-4.py-1.flex.items-center")
	private List<WebElement> organizationName;

	public OrganizationPage(WebDriver driver) {
		super(driver);
	}
}



