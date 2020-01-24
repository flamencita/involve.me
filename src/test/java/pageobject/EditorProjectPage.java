package pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
	public void publishButton() {
		click(publishBtn);
	}
	//	/**
	//	 * Drag and drop Free text icon to target zone
	//	 * @param icon
	//	 */
	//	public void dragFreeTextIcon() {
	//		for (int i = 0; i < iconsName.size(); i++) {
	//			if(getText(iconsName.get(i)).contains("Multiple Choice")){
	//				dragAndDrop(fromFreeTextInput, toDropZone);
	//				break;
	//			}
	//		}
	//	}
	
	/**
	 * Drag and drop 'Free Text Input' to target zone"
	 */
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




