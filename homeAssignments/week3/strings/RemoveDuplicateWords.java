package homeAssignments.week3.strings;

public class RemoveDuplicateWords {

    public static void main(String[] args) {
        // Input string containing duplicate words
        String text = "We learn Java basics as part of java sessions in java week1";
        
        // Variable to keep track of the number of duplicate words
        int count = 0;
        
        // String to store the final result without duplicate words
        String text2 = "";
        
        // Split the input string into an array of words
        String array[] = text.split(" ");
        
        // Outer loop to iterate through each word in the array
        for (int i = 0; i < array.length; i++) {
            // Inner loop to compare the current word with the subsequent words
            for (int j = i + 1; j < array.length; j++) {
                // Check if the words are equal (case-insensitive)
                if (array[i].equalsIgnoreCase(array[j])) {
                    // Replace the duplicate word with a space
                    array[j] = " ";
                    // Increment the duplicate count
                    count++;
                }
            }
            // Append the word to the result string, including spaces
            text2 = text2 + array[i] + " ";
        }

        // Check if there were any duplicates
        if (count > 0) {
            // Print the result string after removing duplicates
            System.out.println("String after removing the duplicate words: \n" + text2);
        } else {
            // Print a message if no duplicate words were found
            System.out.println("There are no duplicate words in the String");
        }
    }
}
