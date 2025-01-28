package homeAssignments.week4.list;

import java.util.ArrayList;
import java.util.List;

public class ListIntersection {

	public static void main(String[] args) {
		// Initialize two integer arrays
		int[] array1 = {3, 2, 11, 4, 6, 7};
		int[] array2 = {1, 2, 8, 4, 9, 7};
		
		// Create two lists to store the elements of the arrays
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		// Add elements of the first array to list1
		for (int i=0; i < array1.length; i++) {
			list1.add(array1[i]);
		}
		
		// Add elements of the second array to list2
		for(int j=0; j < array2.length; j++) {
			list2.add(array2[j]);
		}
		
		// Print a message indicating the start of the intersection process
		System.out.println("Intersection of the numbers from the arrays are: ");
		
		// Iterate through each element in list1
		for (Integer integer : list1) {
			// Check if the current element in list1 is present in list2
			if(list2.contains(integer)) {
				// Print the intersecting element
				System.out.println(integer);
			}
		}
	}

}
