package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import io.qameta.allure.Step;

public class NewProjectNamePage extends BasePage{

	@FindBy (css="#project-name")
	private WebElement projectNameFeild;
	@FindBy (css=".swal-button.swal-button--confirm")
	private WebElement startEditingBtn;
	@FindBy (css="li:nth-child(4) > a")
	private WebElement saveAndExitBtn;

	public NewProjectNamePage(WebDriver driver) {
		super(driver);
	}
	/**
	 * 
	 * Naming the new project 
	 */
	@Step("Fill in the name you want for your new project, click 'Start editing',Than click on 'Save and Exit' button")
	public void namingProject(String newProjectName) {
		fillText(projectNameFeild, newProjectName);
		sleep(2000);
		click(startEditingBtn);
		sleep(2000);
		click(saveAndExitBtn);
		sleep(2000);
	}
}
