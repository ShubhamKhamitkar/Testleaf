package homeAssignments.week3.inheritance.hybridInheritance;

//Created a sub class which is inheriting WebElement class 
public class TextField extends WebElement{
	
	// Method to get and return text
	public String getText() {
		return "Shubham";
	} 
	
	public static void main(String[] args) {
		// Create an instance of the TextField subclass
		TextField textField = new TextField();
		
		// Call the getText method to retrieve text and store it in a variable
		String name = textField.getText();

		// Call the inherited method to simulate a click action
		textField.click();
		
		// Call the inherited method to set text with the retrieved value
		textField.setText(name);
	}
}
