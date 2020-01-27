package pageobject;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectsPage extends BasePage {

	@FindBy(css=".flex.flex-col.justify-center.items-center a")
	private WebElement startProjectBtn;
	@FindBy(css=".flex-1.mr-3 > button > svg")
	private WebElement searchProjectBtn;
	@FindBy(css=".mr-3 > input")
	private WebElement fillProjectName;
	@FindBy(css="div.flex.justify-right > div > a")
	private List<WebElement> openMenuProjectBtn;
	@FindBy(css= "div.mb-3 > h1")
	private List<WebElement> projectNames;
	@FindBy(css=" :nth-child(1) > .absolute  ul > li")
	private List <WebElement> menuList;
	//Plus icon creates new workspace
	@FindBy(css="#app div.flex.justify-between.text-lg.font-medium.px-5 > button")
	private WebElement plusBtn;
	@FindBy(css=".px-5.flex.justify-between.text-base > :nth-child(2)")
	private WebElement workspaceCounter;
	@FindBy(css="#app .relative.pb-24 h1 > a")
	private WebElement projectNameElement;
	@FindBy(css="div.px-4.items-center > a")
	private WebElement createNewProject;
	@FindBy(css="#confirm-delete-button")
	private WebElement deleteBtn;

	public ProjectsPage(WebDriver driver) {
		super(driver);
	}
	/**
	 * Clicks start a new project button-First project
	 */
	public void startNewProject() {
		click(startProjectBtn);
	}
	/**
	 * Creates new project when there are other projects
	 */
	public void createNewProject() {
		click(createNewProject);
	}
	/** 
	 * Delete the relevant project
	 */
	public void deleteProject(String projectName) {
		for (int i = 0; i < projectNames.size(); i++) {
			if (projectNames.get(i).getText().equalsIgnoreCase(projectName)) {
				sleep(4000);
				click(openMenuProjectBtn.get(i));
				sleep(4000);
				break;
			}
		}
	}
	/**
	 * Selecting from project menu any option
	 * @param chooseFromMenu
	 */
	public void selectFromMenu(String chooseFromMenu) {
		for (WebElement el : menuList) {
			if(el.getText().equalsIgnoreCase(chooseFromMenu)) {
				sleep(4000);
				el.click();
				sleep(4000);
				break;
			}
		}
	}
	public int getWorkspaceCount()
	{
		sleep(10000);
		return Integer.parseInt(getText(workspaceCounter));
	}
	/**
	 * Clicks + icon to create new workspace
	 */
	public void createWorkspaceIcon() {
		sleep(3000);
		click(plusBtn);
		sleep(4000);
	}
	/**
	 * Find project by name
	 * @param projectName
	 */
	public void findProject(String projectName) {
		click(searchProjectBtn);
		fillText(fillProjectName, projectName);
		for (int i = 0; i < projectNames.size(); i++) {
			if (getText(projectNames.get(i)).contains(projectName)) {
				break;
			}
		}
	}
	/**
	 * Gets the project name
	 * @return
	 */
	public String getProjectName() {
		sleep(8000);
		return projectNameElement.getText();
	}
}





