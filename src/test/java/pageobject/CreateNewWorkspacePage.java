package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.qameta.allure.Step;

public class CreateNewWorkspacePage extends BasePage {
	//Workspace
	@FindBy(css="#app > div.vue-portal-target form > div.p-6.md\\:p-8 > input")
	private WebElement workspaceNameField;
	@FindBy(css="#confirm-create-button")
	private WebElement createbtn;
	
	public CreateNewWorkspacePage(WebDriver driver) {
		super(driver);
	}
	/**
	 * Naming a new workspace and clicks create
	 */
	@Step("Fill in work space name and click create button")
	public void createNewWorkspace(String name) {
		fillText(workspaceNameField, name);
		click(createbtn);
	}
}
