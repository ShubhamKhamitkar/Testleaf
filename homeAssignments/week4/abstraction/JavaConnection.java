package homeAssignments.week4.abstraction;

//This class JavaConnection extends MySqlConnection 
public class JavaConnection extends MySqlConnection{

	// Overriding the connect method to provide implementation
	@Override
	public void connect() {
		System.out.println("Connecting");
	}

	// Overriding the disconnect method to provide implementation
	@Override
	public void disconnect() {
		System.out.println("Disconnecting");
	}

	// Overriding the executeUpdate method to provide implementation
	@Override
	public void executeUpdate() {
		System.out.println("Updating");
	}
	
	// Overriding the executeQuery method to provide implementation
	@Override
	public void executeQuery() {
		System.out.println("Executing the query");
	}
	
	// The main method where an object of JavaConnection is created
	public static void main(String[] args) {
		JavaConnection java = new JavaConnection();
		java.connect(); 			// Calls the connect method
		java.executeUpdate();		// Calls the executeUpdate method
		java.executeQuery();		// Calls the executeQuery method
		java.disconnect();			// Calls the disconnect method
	}

}
