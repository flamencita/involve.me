package pageobject;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.qameta.allure.Step;

public class EditorProjectPage extends BasePage {

	@FindBy(css=".btn-secondary.save-btn")
	private WebElement publishBtn;
	//	@FindBy(css="c-menu-scquestion content-menu-item")
	//	private WebElement fromFreeTextInput;
	@FindBy(css="div.e-target-dropzone.vcentered.bgfixed.center-left > div")
	private WebElement toDropZone;
	@FindBy(css="div.svg-wrapper + p")
	private List <WebElement> iconsName;

	public EditorProjectPage(WebDriver driver) {
		super(driver);
	}
	/**
	 * Clicks the publish button
	 */
	@Step("Click on 'Publish' button")
	public void publishButton() {
		click(publishBtn);
	}
	/**
	 * Drag and drop 'Free Text Input' to target zone"
	 */
	@Step("Drag and srop 'Free Text Inut' item into the target zone")
	public void dragFreeTextIcon() {
		for (WebElement cubeIcon : iconsName) {
			//System.out.println(cubeIcon.getText());
			if(cubeIcon.getText().contains("Free Text Input")) {
				//	System.out.println("im here");
				dragAndDrop(cubeIcon, toDropZone);
				break;
			}
		}
	}
	/**
	 * Drag and drop 'Contact info' to target zone"
	 */
	@Step("Drag and srop 'Contact Info' item into the target zone")
	public void dragContactInfoIcon() {
		for (WebElement cubeIcon : iconsName) {
			System.out.println(cubeIcon.getText());
			if(cubeIcon.getText().contains("Contact Info")) {
				System.out.println("im here");
				dragAndDrop(cubeIcon, toDropZone);
				break;
			}
		}
	}
}




