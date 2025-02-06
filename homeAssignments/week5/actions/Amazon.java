package homeAssignments.week5.actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// Initialize the ChromeDriver to interact with the browser
		ChromeDriver driver = new ChromeDriver();
		
		// Open the specified URL (Amazon India homepage)
		driver.get("https://www.amazon.in/");
		
		// Maximize the browser window
		driver.manage().window().maximize();
		
		// Set an implicit wait of 30 seconds to allow elements to load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Locate the search box and enter "oneplus 9 pro"
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
		
		// Create an instance of Actions class for mouse interactions
		Actions action = new Actions(driver);
		
		// Locate the search button and click it using Actions class
		WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
		action.moveToElement(searchButton).click().perform();
		
		// Apply filter by selecting "OnePlus" brand
		driver.findElement(By.xpath("//span[text()='OnePlus']")).click();
		
		// Wait for 5 seconds for the results to load
		Thread.sleep(5000);
		
		// Get the price of the first product in the search results
		String priceOfFirstProduct = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println("Price of First Product : " + priceOfFirstProduct + " Rs");
		
		// Get the number of customer ratings for the first product
		String numberOfCustomerRatings = driver.findElement(By.xpath("//span[@class='a-size-base s-underline-text']")).getText();
		System.out.println("Number of customer ratings of first product : " + numberOfCustomerRatings);
		
		// Click on the first product to open its details page
		driver.findElement(By.xpath("//div[@data-cy='title-recipe']")).click();
		
		// Handle multiple windows - get window handles and switch to the new tab
		Set<String> windowHandlesSet = driver.getWindowHandles();
		List<String> windowHandles= new ArrayList<String>(windowHandlesSet);
		driver.switchTo().window(windowHandles.get(1));
		
		// Wait for 5 seconds for the page to load
		Thread.sleep(5000);
		
		// Locate the "Add to Cart" button and click it using Actions class
		WebElement addtocart = driver.findElement(By.xpath("//span[text()='Add to Cart']"));
		action.moveToElement(addtocart).click().perform();
		
		// Wait for 5 seconds to ensure the cart is updated
		Thread.sleep(5000);
		
		// Retrieve and print the subtotal of the product from the cart
		String subTotal = driver.findElement(By.xpath("(//*[@id='attach-accessory-cart-subtotal'])[1]")).getText();
		System.out.println("Subtotal of Product : " + subTotal);
		
		// Close the browser session
		driver.quit();
	}
}
