package week1.homeAssigments;

public class IsPrime {

	public static void main(String[] args) {
		int number = 13;
		int prime = 0;
		for (int i = 2; i < number/2; i++) {
			if(number%i==0) {
				prime = 1;
				System.out.println("This number is not a prime number.");
				break;
			}
		}
		
		if(prime==0) {
			System.out.println("This number is a prime number.");
		}

	}

}
