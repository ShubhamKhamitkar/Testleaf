package homeAssignments.week2.selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateFacebookAccountUsingSelectClass {

	public static void main(String[] args) {
	// Initialize the ChromeDriver
        ChromeDriver driver = new ChromeDriver();
        
        // Open the URL in the browser
        driver.get("https://en-gb.facebook.com/");
        
        // Maximize the browser window for better visibility
        driver.manage().window().maximize();
	 	 
        // Apply implicit wait for 30 seconds to ensure elements are loaded before interactions
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        driver.findElement(By.partialLinkText("Create new account")).click();
        
        // Fill out the "Create Account" form
        driver.findElement(By.name("firstname")).sendKeys("Shubham");
        driver.findElement(By.name("lastname")).sendKeys("Khamitkar");
        driver.findElement(By.name("reg_email__")).sendKeys("8208648990");
        driver.findElement(By.id("password_step_input")).sendKeys("Shubham@99");
        
        // Find the Birthday dropdown element and create a Select object for it
        WebElement birthdayDropdown = driver.findElement(By.id("day"));
        Select selectBirthday = new Select(birthdayDropdown);
        // Select an option by its index
        selectBirthday.selectByIndex(4);
        
        // Find the Birthmonth dropdown element and create a Select object for it
        WebElement birthmonthDropdown = driver.findElement(By.id("month"));
        Select selectBirthmonth = new Select(birthmonthDropdown);
        // Select an option by its value attribute
        selectBirthmonth.selectByValue("11");
        
        // Find the Birthyear dropdown element and create a Select object for it
        WebElement birthyearDropdown = driver.findElement(By.id("year"));
        Select selectBirthyear = new Select(birthyearDropdown);
        // Select an option by its visible text
        selectBirthyear.selectByVisibleText("1999");
        
        // Find all the Male Radio button element and click on it
        WebElement maleGender = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));        
        maleGender.click();
	}

}
