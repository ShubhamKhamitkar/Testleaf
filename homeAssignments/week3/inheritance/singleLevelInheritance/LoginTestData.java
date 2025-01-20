package homeAssignments.week3.inheritance.singleLevelInheritance;

public class LoginTestData extends TestData{
	public void enterUsername() {
	    // Method to prompt the user to enter their username
	    System.out.println("Please enter your username");
	}

	public void enterPassword() {
	    // Method to prompt the user to enter their password
	    System.out.println("Please enter your password");
	}

	public static void main(String[] args) {
	    // Create an instance of the LoginTestData class
	    LoginTestData subclass = new LoginTestData();
	    
	    // Call the method to prompt the user to enter credentials
	    subclass.enterCredentials();
	    
	    // Call the method to prompt the user to enter their username
	    subclass.enterUsername();
	    
	    // Call the method to prompt the user to enter their password
	    subclass.enterPassword();
	    
	    // Call the method to display navigation to the Home Page
	    subclass.navigateToHomePage();
	}


}
