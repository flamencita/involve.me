package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.qameta.allure.Step;

public class ChooseProjectTypePage extends BasePage{
	//Project type
	@FindBy(css=".container > div:nth-child(3) a:nth-child(1) div.icon")
	private WebElement quizProjectBtn;

	public ChooseProjectTypePage(WebDriver driver) {
		super(driver);
	}
	/**
	 * This will select the quiz project
	 */
	@Step("Select Quiz Project")
	public void selectQuizProject() {
		click(quizProjectBtn);
	}
}
