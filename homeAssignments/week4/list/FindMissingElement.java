package homeAssignments.week4.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingElement {

	public static void main(String[] args) {
		// Initialize an array with some integers where elements are missing
		int array[] = {1, 2, 3, 4, 10, 6, 8};
		
		// Create a list to store the elements of the array
		List<Integer> numbers = new ArrayList<Integer>();
		
		// Add each element of the array into the list
		for (int i = 0; i < array.length; i++) {
			numbers.add(array[i]);
		}
		
		// Sort the list to ensure the elements are in ascending order
		Collections.sort(numbers);
		
		// Create a list to store the missing numbers
		List<Integer> missingNumbers = new ArrayList<Integer>();
		
		// Iterate through the sorted list to find missing numbers
		for(int j = 0; j < numbers.size() - 1; j++) {
			
			// Check if the current element + 1 is not equal to the next element
			if(numbers.get(j) + 1 != numbers.get(j+1)) {
				
				// Identify the missing number and add it to the list
				int missing = numbers.get(j) + 1;
				
				// Handle cases where more than one number is missing
				while(missing < numbers.get(j+1)) {
					missingNumbers.add(missing);	// Add each missing number to the list
					missing++;						// Increment to check for the next missing number
				}
			}
		}
		
		// Print the list of missing elements
		System.out.println("Missing elements in the array are:- " + missingNumbers);
	}

}
