package homeAssignments.week3.polymorphism;

public class APIClient {
	
	// Method to send a request with only the endpoint as a parameter
	public void sendRequest(String endpoint) {
		System.out.println("Endpoint which is used: " + endpoint);
	}
	
	// Method to send a request with endpoint, request body, and request status as parameters
	public void sendRequest(String endpoint, String requestBody, Boolean requestStatus) {
		System.out.println("\nEndpoint which is used: " + endpoint);
		System.out.println("Request body of the API is: " + requestBody);
		if(requestStatus){
			System.out.println("API request is success");
		}
	}


	public static void main(String[] args) {
		// Create an instance of the APIClient class
		APIClient object = new APIClient();
		
		// Call the sendRequest method with only the endpoint as a parameter
		object.sendRequest("requestTrip");
		
		// Call the sendRequest method with endpoint, request body, and request status as parameters
		object.sendRequest("acceptTrip", "Accept the trip from Driver", true);
	}

}
