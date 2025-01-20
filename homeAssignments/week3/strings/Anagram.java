package homeAssignments.week3.strings;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        // Define two strings to check if they are anagrams
        String text1 = "stops"; 
        String text2 = "potss";
        
        int count = 0; // Counter to track mismatches
        
        // Check if the lengths of both strings are equal
        if(text1.length() == text2.length()) {
            // Convert both strings to character arrays
            char array1[] = text1.toCharArray();
            char array2[] = text2.toCharArray();
            
            // Sort both character arrays
            Arrays.sort(array1);
            Arrays.sort(array2);
            
            // Compare each character of the sorted arrays
            for (int i = 0; i < array1.length; i++) {
                if(array1[i] != array2[i]) { // If characters don't match
                    System.out.println("The given strings are not an Anagram.");
                    count++; // Increment count for mismatch
                    break; // Exit the loop as strings are not anagrams
                }
            }
            // If no mismatches are found, the strings are anagrams
            if(count == 0) {
                System.out.println("The given strings are Anagram.");
            }
        }
        else {
            // If lengths are not equal, the strings cannot be anagrams
            System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
        }
    }
}
