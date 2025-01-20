package homeAssignments.week3.inheritance.hybridInheritance;

//Created a subclass which is inheriting the Button class
public class CheckBoxButton extends Button {

	// Method to simulate a click action specifically for a checkbox button
	public void clickCheckButton() {
		System.out.println("Clicks on Check Button");
	}
	
	public static void main(String[] args) {
		// Create an instance of the CheckBoxButton subclass
		CheckBoxButton checkBoxButton = new CheckBoxButton();
		
		// Call the method to simulate clicking the checkbox button
		checkBoxButton.clickCheckButton();
		
		// Call the inherited method to simulate a submit action from Button Class
		checkBoxButton.submit();
		
		// Call the inherited method to simulate a generic click action from WebElement Class
		checkBoxButton.click();
     
		// Call the inherited method to set text with a specific value from WebElement Class
		checkBoxButton.setText("Shubham");
	}
}
