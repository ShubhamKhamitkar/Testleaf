package homeAssignments.week4.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// Initialize an array with company names
		String[] companies = {"HCL", "Wipro", "Aspire Systems", "CTS"};
		
		// Create a list to store the company names from the array
		List<String> companiesList = new ArrayList<String>();
		
		// Add each company name from the array into the list
		for (int i = 0; i < companies.length; i++) {
			companiesList.add(companies[i]);
		}
		
		// Sort the list of companies in ascending alphabetical order
		Collections.sort(companiesList);
		
		// Create a new list to store the companies in reverse order
		List<String> reversedCompaniesList = new ArrayList<String>();
		
		// Iterate through the sorted list in reverse order and add each element to the new list
		for (int i = companiesList.size() - 1; i >= 0; i--) {
			reversedCompaniesList.add(companiesList.get(i));
		}
		
		// Print the reversed list of company names
		System.out.println(reversedCompaniesList);
	}

}
