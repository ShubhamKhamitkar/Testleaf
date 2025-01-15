package homeAssignments.week2.selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountUsingSelectClass {
	
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
        
        // Navigate to "Accounts" section by clicking on it 
        driver.findElement(By.linkText("Accounts")).click();
        
        // Navigate to the "Create Account" page
        driver.findElement(By.linkText("Create Account")).click();
        
        // Fill out the "Create Account" form
        driver.findElement(By.id("accountName")).sendKeys("Shubham");
        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
        
        // Find the Industry dropdown element and create a Select object for it
        WebElement industryDropdown = driver.findElement(By.name("industryEnumId"));
        Select selectIndustry = new Select(industryDropdown);
        // Select an option by its index
        selectIndustry.selectByIndex(3);
        
        // Find the Ownership dropdown element and create a Select object for it
        WebElement ownershipDropdown = driver.findElement(By.name("ownershipEnumId"));
        Select selectOwnership = new Select(ownershipDropdown);
        // Select an option by its visible text
        selectOwnership.selectByVisibleText("S-Corporation");
        
        // Find the Source dropdown element and create a Select object for it
        WebElement sourceDropdown = driver.findElement(By.id("dataSourceId"));
        Select selectSource = new Select(sourceDropdown);
        // Select an option by its value attribute
        selectSource.selectByValue("LEAD_EMPLOYEE");
        
        // Find the Marketing Campaign dropdown element and create a Select object for it
        WebElement marketingCampaignDropdown = driver.findElement(By.id("marketingCampaignId"));
        Select selectMarketingCampaign = new Select(marketingCampaignDropdown);
        // Select an option by its index
        selectMarketingCampaign.selectByIndex(6);
        
        // Find the State dropdown element and create a Select object for it
        WebElement stateDropdown = driver.findElement(By.id("generalStateProvinceGeoId"));
        Select selectState = new Select(stateDropdown);
        // Select an option by its value attribute
        selectState.selectByValue("TX");
        
        // Submit the form to create the account by clicking the submit button
        driver.findElement(By.className("smallSubmit")).click();
        
        // Get the title of the page after account creation and print it to the console
        String title = driver.getTitle();
        System.out.println("Page Title after creating the account: " + title);
        
        // Close the browser window
        driver.close();
	}

}
