package homeAssignments.week5.actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException {
		// Initialize the ChromeDriver to interact with the browser
		ChromeDriver driver = new ChromeDriver();

		// Open the specified URL
		driver.get("https://www.snapdeal.com/");

		// Maximize the browser window
		driver.manage().window().maximize();

		// Set an implicit wait of 30 seconds to allow elements to load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		Actions action = new Actions(driver);
		// Locate and hover over "Men's Fashion" category
		WebElement menFashion = driver.findElement(By.xpath("//span[text()=\"Men's Fashion\"]"));
		action.moveToElement(menFashion).perform();

		// Click on "Sports Shoes" category
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();

		// Fetch and print total men's sports shoes count
		String numberOfSportShoes = driver
				.findElement(By.xpath("//span[contains(@class, 'category-name category-count')]")).getText();
		System.out.println("Total men's sports shoes count is: " + numberOfSportShoes);

		// Click on "Training Shoes" filter
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();

		// Click on "Sort by" dropdown
		driver.findElement(By.xpath("//span[text()='Sort by:']")).click();

		// Select "Price Low to High" sorting option
		driver.findElement(By.xpath("//li[@data-sorttype='plth']")).click();

		Thread.sleep(2000);

		// Fetch all product prices
		List<WebElement> pricesElements = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));

		List<String> prices = new ArrayList<String>();

		// Store all prices in a list
		for (WebElement element : pricesElements) {
			prices.add(element.getText());
		}

		// Create a sorted copy of the price list
		List<String> pricesSorted = new ArrayList<String>(prices);
		Collections.sort(pricesSorted);

		// Check if the prices are sorted correctly
		boolean isSorted = prices.equals(pricesSorted);

		if (isSorted) {
			System.out.println("Prices are sorted");
		}

		// Apply price filter (500 to 700)
		driver.findElement(By.xpath("//input[@name='fromVal']")).clear();
		driver.findElement(By.xpath("//input[@name='fromVal']")).sendKeys("500");

		driver.findElement(By.xpath("//input[@name='toVal']")).clear();
		driver.findElement(By.xpath("//input[@name='toVal']")).sendKeys("700");

		// Click on "GO" button to apply filter
		driver.findElement(By.xpath("//div[contains(text(),'GO')]")).click();

		Thread.sleep(2000);

		// Apply color filter
		driver.findElement(By.xpath("//span[contains(@class,'filter-color-tile')]")).click();

		// Hover over the first product to view quick options
		WebElement firstProduct = driver.findElement(By.xpath("//img[@class='product-image wooble']"));
		action.moveToElement(firstProduct).perform();

		Thread.sleep(2000);

		// Click on "Quick View" of the first product
		driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")).click();

		Thread.sleep(2000);

		// Fetch and print the cost of the shoe
		String cost = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		System.out.println("The cost of the shoe is: Rs" + cost);

		// Fetch and print the discount percentage of the shoe
		String discount = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println("The discount percentage for the shoe is: " + discount);

		// Close the browser
		driver.close();
	}
}
