package pageobject;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectsPage extends BasePage {

	//When there is no other project!
	@FindBy(css=".flex.flex-col.justify-center.items-center a")
	private WebElement startProjectBtn;
	@FindBy(css=".flex-1.mr-3 > button > svg")
	private WebElement searchProjectBtn;
	@FindBy(css=".mr-3 > input")
	private WebElement fillProjectName;
	@FindBy(css=".dropdown.relative>a>svg")
	private List<WebElement> openMenuProject;
	@FindBy(css= "div.mb-3 > h1")
	private List<WebElement> projectNames;
	@FindBy(css="div:nth-child(2) > div.absolute.right-0.left-0.mt-8.mx-3.z-100.flex-1 > div.flex.items-center.justify-between.mb-2  button")
	private WebElement deleteBtn;
	//Plus icon creates new workspace
	@FindBy(css="#app div.flex.justify-between.text-lg.font-medium.px-5 > button")
	private WebElement plusBtn;
	@FindBy(css=".text-base.leading-loose.bg-gray-700.text-white>span:nth-child(2)")
	private WebElement workspaceCounter;
	@FindBy(css="#app .relative.pb-24 h1 > a")
	private WebElement projectName;
	@FindBy(css="div.px-4.items-center > a")
	private WebElement createNewProject;
	@FindBy(css="mr-4 px-1 hover:text-p")
	private WebElement projectCounter;

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
			if (getText(projectNames.get(i)).contains(projectName)) {
				sleep(3000);
				openMenuProject.get(i).click();
				sleep(3000);
				click(deleteBtn);
				break;
			}
		}
	}
	public int getWorkspaceCount()
	{
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
	public void findProject(String projectName) {
		click(searchProjectBtn);
		fillText(fillProjectName, projectName);
		for (int i = 0; i < projectNames.size(); i++) {
			if (getText(projectNames.get(i)).contains(projectName)) {
			}
		}
	}
	/**
	 * Gets the project name
	 * @return
	 */
	public String getProjectName() {
		return projectName.getText();
	}
	/*
	 * Returns the projects number
	 */
	public int getProjectCount()
	{
		return Integer.parseInt(getText(projectCounter));
	}
}





