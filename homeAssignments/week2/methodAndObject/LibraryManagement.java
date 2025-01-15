package homeAssignments.week2.methodAndObject;

public class LibraryManagement {

	public static void main(String[] args) {
		// Create an instance of the Library class
		Library object = new Library();
		
		// Call the addBook method from Library class
		object.addBook("Pride and Prejudice");
		
		// Call the issueBook method from Library class
		object.issueBook();
	}

}
