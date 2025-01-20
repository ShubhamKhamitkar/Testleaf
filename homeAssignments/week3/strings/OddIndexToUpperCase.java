package homeAssignments.week3.strings;

public class OddIndexToUpperCase {

    public static void main(String[] args) {
        // Input string to modify
        String text = "changeme";
        
        // Convert the string to a character array
        char array[] = text.toCharArray();
        
        // String to store the final result
        String text2 = "";

        // Loop through the character array
        for (int i = 0; i < array.length; i++) {
            // Check if the index is odd
            if (i % 2 != 0) {
                // Convert the character at the odd index to uppercase
                array[i] = Character.toUpperCase(array[i]);
            }
            // Append the character to the result string
            text2 = text2 + array[i];
        }

        // Print the final modified string
        System.out.println("Changed text: " + text2);
    }
}
