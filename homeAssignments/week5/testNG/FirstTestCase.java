package homeAssignments.week5.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FirstTestCase extends ProjectSpecificMethod {

	@Test
	public void runCreateNewLegalEntity() throws InterruptedException {
		// Wait for 5 seconds to ensure the page has loaded (This can be improved with
		// waits)
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
		driver.findElement(By.xpath("//div[@class='slds-context-bar__label-action slds-p-left_none slds-p-right_x-small']")).click();

		// Wait for the next action to complete
		Thread.sleep(3000);

		// Locate the "New Legal Entity" span and click it using JavaScript Executor
		// (used when normal click doesn't work)
		WebElement legalEntityElement = driver.findElement(By.xpath("//span[text()='New Legal Entity']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", legalEntityElement);

		// Enter the name for the new Legal Entity in the input field
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation by Shubham");

		// Click the Save button to save the new Legal Entity
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();

		// Retrieve the name of the created Legal Entity from the output field
		String entityName = driver.findElement(By.xpath("(//*[@data-output-element-id='output-field'])[1]")).getText();

		// Print the name of the created Legal Entity to the console
		System.out.println(entityName);
	}

}