package homeAssignments.week2.methodAndObject;

public class Library {

    public static void main(String[] args) {
        // Create an instance of the Library class
        Library library = new Library();
        
        // Call the addBook method
        library.addBook("The Call of the Wild");
        
        // Call the issueBook method
        library.issueBook();
    }
    
    // Method to add a book to the library
    public String addBook(String bookTitle){
        System.out.println("Book added successfully: " + bookTitle);
        
        // Return the book title
        return bookTitle;
    }
    
    // Method to issue a book from the library
    public void issueBook() {
        System.out.println("Book issued successfully");
    }

}

