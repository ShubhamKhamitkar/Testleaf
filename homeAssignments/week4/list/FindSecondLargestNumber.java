package homeAssignments.week4.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		// Initialize an array with integer values
		int[] array = {3, 2, 11, 4, 6, 7};
		
		// Create a list to store the elements of the array
		List<Integer> numbers = new ArrayList<Integer>();
		
		// Add each element of the array into the list
		for (int i = 0; i < array.length; i++) {
			numbers.add(array[i]);
		}
		
		// Sort the list in ascending order
		Collections.sort(numbers);
		
		// Retrieve the second largest number from the sorted list
		int secondLargestNumber = numbers.get(numbers.size() - 2);
		
		// Print the second largest number
		System.out.println("Second Largest Number in the array is: " + secondLargestNumber);
	}

}
