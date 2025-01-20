package homeAssignments.week3.strings;

public class ReverseOddWords {

    public static void main(String[] args) {
        // Input string to process
        String test = "I am a software tester";
        
        // Split the input string into an array of words
        String[] words = test.split(" ");
        
        // String to store the final result
        String test2 = "";
        
        // Loop through each word in the array
        for (int i = 0; i < words.length; i++) {
            // Check if the word is at an even index
            if (i % 2 == 0) {
                test2 = test2 + words[i] + " ";
            } else {
                char charArray[] = words[i].toCharArray(); // Convert the word to a character array
                String reverse = ""; // Temporary string to store the reversed word
                
                // Loop to reverse the characters of the word
                for (int j = charArray.length - 1; j >= 0; j--) {
                    reverse = reverse + charArray[j];
                }
                
                // Add the reversed word to the result
                test2 = test2 + reverse + " ";
            }
        }
        
        // Print the final result string
        System.out.println(test2);
    }

}
