package q9;

import java.util.ArrayList;

public class Question9 {
	
	public static void main(String[] args) {
		initializePrintPrime(0,100);
	}
	
	
	public static void initializePrintPrime(int start,int end) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = start; i <= end; i++) {
			list.add(i);
		}
		
		for(int i : list) {
			//ignore 0 and 1 for prime numbers
			if(i == 0 || i == 1) {
				continue;
			}
			if(isPrime(i))
				System.out.print(i + ", ");
		
			
		}
		
	/*
	 * Only need to check values up to half of input
	 * Use modulus to test if value has no remainder which makes it not prime
	 */
	}
	
	private static boolean isPrime(int n) {
		for(int i = 2; i < n/2; i++) {
			if(n%i == 0)
				return false;
		}
		return true;
	}

}
