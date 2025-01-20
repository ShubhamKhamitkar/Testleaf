package homeAssignments.week3.inheritance.singleLevelInheritance;

public class TestData {
	public void enterCredentials() {
	    // Method to prompt the user to enter their credentials
	    System.out.println("Please enter your credentials");
	} 

	public void navigateToHomePage() {
	    // Method to display a message indicating navigation to the Home Page
	    System.out.println("You are navigated to Home Page");
	}

	public static void main(String[] args) {
	    // Create an instance of the TestData class
	    TestData superClass = new TestData();
	    
	    // Call the method to prompt the user to enter credentials
	    superClass.enterCredentials();
	    
	    // Call the method to display the navigation to the Home Page
	    superClass.navigateToHomePage();
	}


}
