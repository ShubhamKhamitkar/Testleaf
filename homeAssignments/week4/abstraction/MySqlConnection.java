package homeAssignments.week4.abstraction;

//This is an abstract class named MySqlConnection that implements the DatabaseConnection interface
public abstract class MySqlConnection implements DatabaseConnection{

	// Declaring an abstract method executeQuery
	public abstract void executeQuery();
}
