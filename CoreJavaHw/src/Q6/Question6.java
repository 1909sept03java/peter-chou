package Q6;
/*
 * Write a program to determine if an integer is even without using the modulus
operator (%)
 */

public class Question6 {
	
	public static boolean isEven(int n)
	{
		int half = n /2;
		if(half * 2 == n)
			return true;
		else
			return false;
	}

}
