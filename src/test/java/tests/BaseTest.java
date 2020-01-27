package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

class BaseTest {
	WebDriver driver;

	@BeforeClass
	public void setup(ITestContext testContext) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
        testContext.setAttribute("WebDriver", this.driver);
		driver.manage().window().maximize();
		driver.get("https://www.involve.me/");
	}
	
	@AfterClass
	public void closeDriver() {
	driver.quit();
	}
}

