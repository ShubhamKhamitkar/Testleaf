package homeAssignments.week5.actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasket {

	public static void main(String[] args) throws InterruptedException {
		// Initialize the ChromeDriver to interact with the browser
		ChromeDriver driver = new ChromeDriver();

		// Open the specified URL
		driver.get("https://www.bigbasket.com/");

		// Maximize the browser window
		driver.manage().window().maximize();

		// Set an implicit wait of 30 seconds to allow elements to load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Click on the Category menu
		driver.findElement(By.xpath("(//span[text()='Category'])[2]")).click();

		// Initialize Actions class for mouse interactions
		Actions action = new Actions(driver);

		Thread.sleep(2000);

		// Hover over the "Foodgrains, Oil & Masala" category
		WebElement foodGrains = driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"));
		action.moveToElement(foodGrains).perform();

		Thread.sleep(2000);

		// Hover over "Rice & Rice Products"
		WebElement riceProducts = driver.findElement(By.xpath("//a[text()='Rice & Rice Products']"));
		action.moveToElement(riceProducts).perform();

		// Click on "Boiled & Steam Rice"
		driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']")).click();

		// Scroll to "BB Royal" filter and select it
		WebElement bbRoyal = driver.findElement(By.id("i-BBRoyal"));
		action.scrollToElement(bbRoyal).perform();
		bbRoyal.click();

		Thread.sleep(3000);

		// Scroll to and select "Tamil Ponni Boiled Rice"
		WebElement tamilPonniRice = driver.findElement(By.xpath("//h3[contains(text(), 'Tamil Ponni Boiled Rice')]"));
		action.scrollToElement(tamilPonniRice).perform();
		tamilPonniRice.click();

		// Switch to the new window
		Set<String> windowHandlesSet = driver.getWindowHandles();
		List<String> windowHandles = new ArrayList<String>(windowHandlesSet);
		driver.switchTo().window(windowHandles.get(1));

		Thread.sleep(3000);

		// Scroll to and select the 5 kg weight option
		WebElement weightElement = driver.findElement(By.xpath("//span[text()='5 kg']"));
		action.scrollToElement(weightElement).perform();
		weightElement.click();

		// Retrieve and print the price of the selected rice
		String MRP = driver.findElement(By.xpath(
				"(//span[@class='Label-sc-15v1nk5-0 PackSizeSelector___StyledLabel5-sc-l9rhbt-5 gJxZPQ bvikaK'])[6]"))
				.getText();
		System.out.println("Price of 5 KG rice is : " + MRP);

		// Scroll to and click the "Add to basket" button
		WebElement addToBasket = driver.findElement(By.xpath("//button[text()='Add to basket']"));
		action.scrollToElement(addToBasket).perform();
		addToBasket.click();

		Thread.sleep(1000);

		// Retrieve and print the toast message
		String toastMessage = driver.findElement(By.xpath("//*[@id=\"toast\"]/div/div/div/p")).getText();
		System.out.println(toastMessage);

		// Verify if the correct success message is displayed
		String expectedMessage = "An item has been added to your basket successfully";
		if (toastMessage.equals(expectedMessage)) {
			System.out.println("Success");
		}

		// Close the current window
		driver.close();

		// Switch back to the original window and close it
		driver.switchTo().window(windowHandles.get(0));
		driver.close();
	}
}