package homeAssignments.week6.staticParameterization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Salesforce {

	@Parameters({"url", "username", "password", "company", "description"})
	@Test
	public void runCreateNewLegalEntity(String url,String uName,String pass, String cName, String desc) throws InterruptedException {
		// Initialize ChromeDriver to launch the browser
		ChromeDriver driver = new ChromeDriver();

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

		// Wait for 5 seconds to ensure the page has loaded after clicking Legal Entities
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
		
		// Enter the company name in the "CompanyName" input field
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys(cName);

		// Enter the description in the second textarea field
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys(desc);

		// Click on the combobox button to open the options for selecting the status
		driver.findElement(By.xpath("//button[@role='combobox']")).click();

		// Locate the "Active" option and click it using JavaScript Executor
		WebElement activeOption = driver.findElement(By.xpath("//span[@title='Active']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", activeOption);

		// Click the Save button to save the new Legal Entity
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();

		// Verify if the validation message "Complete this field." is displayed for a required field
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Complete this field.']")).isDisplayed());
		
		driver.close();
	}

}
