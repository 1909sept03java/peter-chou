package Q6;
/*
 * Write a program to determine if an integer is even without using the modulus
operator (%)
 */

public class Question6 {
	
	/*
	 * Check evens by dividing input by 2 and multiplying by 2 again 
	 * and compare with original input
	 * If same, is even
	 * Due to nature of integers in Java, ints are rounded down if fraction or decimals.
	 */
	public static boolean isEven(int n)
	{
		int half = n /2;
		if(half * 2 == n)
			return true;
		else
			return false;
	}

}
