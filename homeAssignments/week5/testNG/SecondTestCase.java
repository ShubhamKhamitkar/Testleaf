package homeAssignments.week5.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SecondTestCase extends ProjectSpecificMethod {

	@Test
	public void runCreateNewEntity() throws InterruptedException {
		// Wait for 5 seconds to ensure the page has loaded (This can be improved with
		// waits)
		Thread.sleep(5000);

		// Click on the App Launcher button to open the app menu
		driver.findElement(By.xpath("//button[@title='App Launcher']")).click();

		// Wait for 3 seconds for the next page to load
		Thread.sleep(3000);

		// Click on "View All Applications" button to see all available apps
		driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();

		// Wait for the page to load after clicking View All
		Thread.sleep(5000);

		// Locate the "Legal Entities" element using its XPath
		WebElement legalEntities = driver.findElement(By.xpath("//p[text()='Legal Entities']"));

		// Scroll to the Legal Entities element to make sure it's in the viewport
		Actions action = new Actions(driver);
		action.scrollToElement(legalEntities).perform();

		// Click on the Legal Entities link to navigate to the Legal Entities section
		legalEntities.click();

		// Wait for 5 seconds to ensure the page has loaded after clicking Legal
		// Entities
		Thread.sleep(5000);

		// Click on the "New" button to create a new Legal Entity
		driver.findElement(
				By.xpath("//div[@class='slds-context-bar__label-action slds-p-left_none slds-p-right_x-small']"))
				.click();

		// Wait for 3 seconds before proceeding to the next step
		Thread.sleep(3000);

		// Locate the "New Legal Entity" span and click it using JavaScript Executor
		// (used when normal click doesn't work)
		WebElement legalEntityElement = driver.findElement(By.xpath("//span[text()='New Legal Entity']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", legalEntityElement);

		// Enter the company name for the new Legal Entity in the "CompanyName" input
		// field
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");

		// Enter the description for the new Legal Entity in the second textarea field
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("Salesforces");

		// Click on the combobox button to open the options for selecting the status
		driver.findElement(By.xpath("//button[@role='combobox']")).click();

		// Locate the "Active" option and click it using JavaScript Executor
		WebElement activeOption = driver.findElement(By.xpath("//span[@title='Active']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", activeOption);

		// Click the Save button to save the new Legal Entity
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();

		// Verify if the validation message "Complete this field." is displayed for a
		// required field
		driver.findElement(By.xpath("//div[text()='Complete this field.']")).isDisplayed();
	}
}