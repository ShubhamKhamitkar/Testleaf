package homeAssignments.week3.inheritance.hybridInheritance;

//Created a sub class which is inheriting WebElement class 
public class Button extends WebElement{
	
	// Method to simulate a submit action
	public void submit() {
		System.out.println("Submitting it");
	} 
	
	public static void main(String[] args) {
		// Create an instance of the Button subclass
		Button button = new Button();
		
		// Call the method to simulate a submit action
		button.submit();
		
		// Call the inherited method to simulate a click action
		button.click();
		
		// Call the inherited method to set text with a specific value
		button.setText("Shubham");

	}
}
