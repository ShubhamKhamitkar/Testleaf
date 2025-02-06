package homeAssignments.week5.testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethod {
	public ChromeDriver driver;

	// This method is executed before each test case
	@BeforeMethod
	public void preCondition() {
		// Initialize ChromeDriver to launch the browser
		driver = new ChromeDriver();

		// Open the Salesforce login page
		driver.get("https://login.salesforce.com");

		// Maximize the browser window
		driver.manage().window().maximize();

		// Set an implicit wait of 30 seconds to allow elements to load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Enter username in the login field
		driver.findElement(By.id("username")).sendKeys("vidyar@testleaf.com");

		// Enter password in the password field
		driver.findElement(By.id("password")).sendKeys("Sales@123");

		// Click the login button to access the Salesforce dashboard
		driver.findElement(By.id("Login")).click();
	}

	// This method is executed after each test case
	@AfterMethod
	public void postCondition() {
		// Close the browser after test execution
		driver.close();
	}
}
