package Q4;

public class Question4 {
	
	/*
	 * Simple factorial program
	 */
	public static int factorial(int n) {
		int product = 1;
		for(int i = 1; i <= n;i++) {
			product *= i;
		}
		return product;
	}

}
