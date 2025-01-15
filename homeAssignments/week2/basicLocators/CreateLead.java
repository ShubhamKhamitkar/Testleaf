package homeAssignments.week2.basicLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		
	// Initialize the ChromeDriver
        ChromeDriver driver = new ChromeDriver();
        
        // Open the URL in the browser
        driver.get("http://leaftaps.com/opentaps/");
        
        // Maximize the browser window for better visibility
        driver.manage().window().maximize();
        
        // Apply implicit wait for 30 seconds to ensure elements are loaded before interactions
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        // Login with the provided username and password
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        
        // Find the Login button and click it to log in
        driver.findElement(By.className("decorativeSubmit")).click();
        
        // Navigate to CRM/SFA page after login by clicking the link
        driver.findElement(By.linkText("CRM/SFA")).click();
        
        // Navigate to "Leads" section by clicking on it 
        driver.findElement(By.linkText("Leads")).click();
        
        // Navigate to the "Create Lead" page
        driver.findElement(By.linkText("Create Lead")).click();
        
        // Fill out the "Create Lead" form
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Shubham");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Khamitkar");
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
        driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Selenium Automation Lead");
        
        // Submit the form to create the account by clicking the submit button
        driver.findElement(By.className("smallSubmit")).click();
        
        // Get the title of the page after account creation and print it to the console
        String title = driver.getTitle();
        System.out.println("Page Title after creating the account: " + title);
        
        // Close the browser window
        driver.close();
	}

}
