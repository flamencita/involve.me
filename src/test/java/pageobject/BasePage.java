package pageobject;

import java.util.Set;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

class BasePage {
	WebDriver driver;
	JavascriptExecutor js;
	String mainWindow;
	WebDriverWait wait;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		js = (JavascriptExecutor) driver;
		PageFactory.initElements(driver, this);
	}

	public void click(WebElement el) {
		el.click();
	}

	public void fillText(WebElement el, String text) {
		el.clear();
		el.sendKeys(text);
	}

	public String getText(WebElement el) {
		return el.getText();
	}

	public void moveToNewWindow() {
		mainWindow = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		for (String win : windows) {
			driver.switchTo().window(win);
		}
	}

	public void moveBackToMainWindow() {
		driver.switchTo().window(mainWindow);
	}

	public void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void dragAndDrop(WebElement from, WebElement to) {
		Actions builder = new Actions(driver);
		Action dragAndDrop = builder.clickAndHold(from)
		   .moveToElement(to)
		   .release(to)
		   .build();
		dragAndDrop.perform();
	}
}
