package homeAssignments.week6.dynamicParameterization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SalesforceNewEntity {
	
	public ChromeDriver driver;

	@Parameters({"url", "username", "password"})
	@BeforeMethod()
	public void loginSteps(String url, String uName, String pass) {
		// Initialize ChromeDriver to launch the browser
		driver = new ChromeDriver();

		// Open the URL
		driver.get(url);

		// Maximize the browser window
		driver.manage().window().maximize();

		// Set an implicit wait of 30 seconds to allow elements to load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Enter username in the login field
		driver.findElement(By.id("username")).sendKeys(uName);

		// Enter password in the password field
		driver.findElement(By.id("password")).sendKeys(pass);

		// Click the login button to access the Salesforce dashboard
		driver.findElement(By.id("Login")).click();
	}

	@Test(dataProvider = "fetchData")
	public void runCreateNewLegalEntity(String name) throws InterruptedException {
		Thread.sleep(5000);

		// Click on the App Launcher button
		driver.findElement(By.xpath("//button[@title='App Launcher']")).click();

		// Wait for 3 seconds for the next page to load
		Thread.sleep(3000);

		// Click on "View All Applications" button to see all available apps
		driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();

		// Wait for the page to load after clicking View All
		Thread.sleep(5000);

		// Locate the Legal Entities element using its XPath
		WebElement legalEntities = driver.findElement(By.xpath("//p[text()='Legal Entities']"));

		// Scroll to the Legal Entities element to make sure it's in the viewport
		Actions action = new Actions(driver);
		action.scrollToElement(legalEntities).perform();

		// Click on the Legal Entities link
		legalEntities.click();

		// Wait for 5 seconds to ensure the page has loaded after clicking Legal
		// Entities
		Thread.sleep(5000);

		// Click on the "New" button to create a new Legal Entity
		driver.findElement(
				By.xpath("//div[@class='slds-context-bar__label-action slds-p-left_none slds-p-right_x-small']"))
				.click();

		// Wait for the next action to complete
		Thread.sleep(3000);

		// Locate the "New Legal Entity" span and click it using JavaScript Executor
		WebElement legalEntityElement = driver.findElement(By.xpath("//span[text()='New Legal Entity']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", legalEntityElement);

		// Enter the name for the new Legal Entity in the input field
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation by " + name);

		// Click the Save button to save the new Legal Entity
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		
		String entityName = driver.findElement(By.xpath("(//*[@data-output-element-id='output-field'])[1]")).getText();
		
		Assert.assertTrue(entityName.equals("Salesforce Automation by " + name));
		
		driver.close();
	}

	@DataProvider(name = "fetchData")
	public String[][] namesData() {
		String names[][] = new String[2][1];

		names[0][0] = "Shubham";
		names[1][0] = "Vanita";
		
		return names;
	}
}
