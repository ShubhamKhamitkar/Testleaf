package homeAssignments.week3.findIntersection;

public class FindIntersection {

	public static void main(String[] args) {
		// Declare and initialize the first array
		int[] array1 = {3,2,11,4,6,7};
		
		// Declare and initialize the second array
		int[] array2 = {1,2,8,4,9,7};
		
		// Print message indicating the start of matching elements
		System.out.println("Matching elements in both the arrays are:");
		
		// Outer loop to iterate over each element of the first array
		for (int i = 0; i < array1.length; i++) {
			
			// Inner loop to iterate over each element of the second array
			for (int j = 0; j < array2.length; j++) {
				
				// Check if elements from both arrays are equal
				if(array1[i] == array2[j]) {
					
					// If a match is found, print the matching element
					System.out.println(array1[i]);
					
					// Exit the inner loop once a match is found
					break;
				}
			}
		}

	}

}
