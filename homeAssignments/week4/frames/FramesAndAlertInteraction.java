package homeAssignments.week4.frames;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAndAlertInteraction {

	public static void main(String[] args) {
		// Initialize the ChromeDriver to interact with the browser
		ChromeDriver driver = new ChromeDriver();
		
		// Open the specified URL
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		// Maximize the browser window
		driver.manage().window().maximize();
		
		// Set an implicit wait of 30 seconds to allow elements to load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Switch to the frame where the 'Try it' button is located
		driver.switchTo().frame("iframeResult");
		
		// Find and click the 'Try it' button to trigger the prompt alert
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		// Switch focus to the alert that appears
		Alert alert = driver.switchTo().alert();
		
		String name = "Shubham";
		
		// Enter the name into the prompt alert
		alert.sendKeys(name);
		
		// Accept the alert
		alert.accept();
		
		// Retrieve the text displayed on the page after interacting with the alert
		String textDisplayed = driver.findElement(By.id("demo")).getText();
		
		// Check if the entered name is displayed on the page
		if(textDisplayed.contains(name)) {
			// If the name is found, print success message
			System.out.println("Entered Name is displayed");
		}
		else {
			// If the name is not found, print failure message
			System.out.println("Entered Name is not displayed");
		}
	}

}
