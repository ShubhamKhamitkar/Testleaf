package homeAssignments.week4.interfaces;

//Class named JavaConnection that implements the DatabaseConnection interface
public class JavaConnection implements DatabaseConnection{

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
	
	// The main method where an object of JavaConnection is created
	public static void main(String[] args) {
		JavaConnection java = new JavaConnection();
		java.connect();				// Calls the connect method
		java.executeUpdate();		// Calls the executeUpdate method
		java.disconnect();			// Calls the disconnect method
	}

}
