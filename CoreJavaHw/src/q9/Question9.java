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
			if(i == 0 || i == 1) {
				continue;
			}
			if(isPrime(i))
				System.out.print(i + ", ");
		
			
		}
		
		
	}
	
	private static boolean isPrime(int n) {
		for(int i = 2; i < n/2; i++) {
			if(n%i == 0)
				return false;
		}
		return true;
	}

}
