package homeAssignments.week4.windowHandling;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// Initialize the ChromeDriver to interact with the browser
		ChromeDriver driver = new ChromeDriver();
		
		// Open the specified URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		// Maximize the browser window
		driver.manage().window().maximize();
		
		// Set an implicit wait of 30 seconds to allow elements to load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Log in with username and password
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        
        // Navigate to "CRM/SFA"
        driver.findElement(By.linkText("CRM/SFA")).click();
        
        // Navigate to "Contacts"
        driver.findElement(By.linkText("Contacts")).click();
        
        // Navigate to "Merge Contacts"
        driver.findElement(By.linkText("Merge Contacts")).click();
        
        // Click on the widget of the "From Contact"
        driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
        
        // Get the window handles and switch to the newly opened window
        Set<String> firstWindowHandlesSet = driver.getWindowHandles();
        List<String> firstWindowHandles = new ArrayList<String>(firstWindowHandlesSet);
        driver.switchTo().window(firstWindowHandles.get(1));
        
        // Click on the first contact from the list
        driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
        
        // Switch back to the original window
        driver.switchTo().window(firstWindowHandles.get(0));
        
        // Click on the widget of the "To Contact"
        driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
        
        // Get the window handles and switch to the newly opened window
        Set<String> secondWindowHandlesSet = driver.getWindowHandles();
        List<String> secondWindowHandles = new ArrayList<String>(secondWindowHandlesSet);
        driver.switchTo().window(secondWindowHandles.get(1));
        
        // Click on the second contact from the list
        driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).click();
        
        // Switch back to the original window
        driver.switchTo().window(secondWindowHandles.get(0));
        
        // Click on the "Merge" button to merge the selected contacts
        driver.findElement(By.className("buttonDangerous")).click();
        
        // Added wait time to load the alert
        Thread.sleep(5000);
        
        // Switch to the alert that appears and accept it
        Alert alert = driver.switchTo().alert();
        alert.accept();
        
        // Get and print the title of the current page
        String title = driver.getTitle();
        System.out.println(title);
        
	}

}
