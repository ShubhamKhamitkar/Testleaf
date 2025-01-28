package homeAssignments.week4.abstraction;

//This is an interface named DatabaseConnection
public interface DatabaseConnection {

	// Unimplemented method to establish a connection to the database
	public void connect();
	
	// Unimplemented method to disconnect from the database
	public void disconnect();
	
	// Unimplemented method to execute an update operation on the database
	public void executeUpdate();
}
