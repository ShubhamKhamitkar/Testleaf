package homeAssignments.week5.webTables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FinanceYahoo {

	public static void main(String[] args) throws InterruptedException {
		// Initialize the ChromeDriver to interact with the browser
		ChromeDriver driver = new ChromeDriver();

		// Open the specified URL
		driver.get("https://finance.yahoo.com/");

		// Maximize the browser window
		driver.manage().window().maximize();

		// Set an implicit wait of 30 seconds to allow elements to load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Click on the 'Markets' section
		driver.findElement(By.xpath("//span[text()='Markets']")).click();

		// Click on the 'Crypto' section to navigate to the cryptocurrency listings
		driver.findElement(By.xpath("//span[text()='Crypto']")).click();

		// Pause execution for 5 seconds to ensure elements load properly
		Thread.sleep(5000);

		// Locate all elements representing cryptocurrency names from the table
		List<WebElement> cryptoElements = driver.findElements(By.xpath("//table/tbody/tr/td[2]/span/div"));

		// Print header for cryptocurrency names
		System.out.println("Crypto currency names are:");

		// Iterate through the list and print each cryptocurrency name
		for (WebElement element : cryptoElements) {
			System.out.println(element.getText());
		}

		// Close the browser
		driver.close();
	}
}
