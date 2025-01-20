package homeAssignments.week3.inheritance.hybridInheritance;

public class Elements extends Button{

	public static void main(String[] args) {
		// Create an instance of the Elements subclass
		Elements elements = new Elements();
		
		// Call the inherited method to simulate a submit action from Button Class
		elements.submit();
		
		// Call the inherited method to simulate a generic click action from WebElement Class
		elements.click();
		
		// Call the inherited method to set text with a specific value from WebElement Class
		elements.setText("Shubham");
	}

}
