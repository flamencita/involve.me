package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewProjectNamePage extends BasePage{


	@FindBy (css="#project-name")
	private WebElement projectNameFeild;
	@FindBy (css=".swal-button.swal-button--confirm")
	private WebElement startEditingBtn;

	public NewProjectNamePage(WebDriver driver) {
		super(driver);
	}
	/**
	 * 
	 * Naming the new project 
	 */
	public void namingProject(String newProjectName) {
		fillText(projectNameFeild, newProjectName);
		sleep(2000);
		click(startEditingBtn);
		sleep(2000);
	}
}
