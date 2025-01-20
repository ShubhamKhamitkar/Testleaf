package homeAssignments.week3.inheritance.hybridInheritance;

//Created a subclass which is inheriting the Button class
public class RadioButton extends Button{
	
	// Method to simulate a select action specifically for a radio button
	public void selectRadioButton() {
		System.out.println("Selects the Radio Button");
	}

	public static void main(String[] args) {
		// Create an instance of the RadioButton subclass
		RadioButton radioButton = new RadioButton();
	
		// Call the method to simulate selecting the radio button
		radioButton.selectRadioButton();
		
		// Call the inherited method to simulate a submit action from Button Class
		radioButton.submit();
	
		// Call the inherited method to simulate a generic click action from WebElement Class
		radioButton.click();
	
		// Call the inherited method to set text with a specific value from WebElement Class
		radioButton.setText("Shubham");
}
}
