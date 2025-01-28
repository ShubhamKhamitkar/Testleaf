package homeAssignments.week4.list;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		// Initialize the ChromeDriver to interact with the browser
		ChromeDriver driver = new ChromeDriver();
		
		// Open the Ajio website
		driver.get("https://www.ajio.com/");
		
		// Maximize the browser window
		driver.manage().window().maximize();
		
		// Set an implicit wait of 30 seconds to allow elements to load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Close the pop-up using the "close" button
		driver.findElement(By.id("closeBtn")).click();
		
		// Enter "bags" in the search box
		driver.findElement(By.name("searchVal")).sendKeys("bags");
		
		// Click on the search button
		driver.findElement(By.className("ic-search")).click();
		
		// Filter the results by selecting "Men" under categories
		driver.findElement(By.xpath("//label[contains(text(), 'Men')]")).click();
		
		// Wait for 5 seconds to allow the page to load filtered results
		Thread.sleep(5000);
		
		// Filter the results further by selecting "Fashion Bags"
		driver.findElement(By.xpath("//label[contains(text(), 'Fashion Bags')]")).click();
		
		// Wait for 5 seconds to allow the page to load filtered results
		Thread.sleep(5000);
		
		// Get the number of items displayed for the selected filters
		String numberOfItems = driver.findElement(By.xpath("//div[@class='length']/strong")).getText();
		System.out.println(numberOfItems);
		
		// Get the list of brand elements displayed on the page
		List<WebElement> brandNameElements = driver.findElements(By.xpath("//div[@class='brand']/strong"));
		
		// Create a list to store the brand names
		List<String> brandNamesList = new ArrayList<String>();
		
		// Iterate through the brand elements and extract the brand names
		for (WebElement brandElements : brandNameElements) {
			String brandNames = brandElements.getText();
			brandNamesList.add(brandNames);
		}
		
		// Print the list of brands displayed
		System.out.println("Brands of products displayed are:- " + brandNamesList);

		// Get the list of bag name elements displayed on the page
		List<WebElement> bagNameElements = driver.findElements(By.xpath("//div[@class='nameCls']"));
		
		// Create a list to store the bag names
		List<String> bagNamesList = new ArrayList<String>();
		
		// Iterate through the bag name elements and extract the bag names
		for (WebElement bagElements : bagNameElements) {
			String bagNames = bagElements.getText();
			bagNamesList.add(bagNames);
		}
		
		// Print the list of bag names displayed
		System.out.println("\nNames of the bags displayed are:- " + bagNamesList);
	}

}
