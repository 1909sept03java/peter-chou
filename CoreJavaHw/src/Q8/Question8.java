package Q8;

import java.util.ArrayList;

/*
 * Write a program that stores the following strings in an ArrayList and saves all the
 * palindromes in another ArrayList.
 */

public class Question8 {
	
	public static void storingPalindrome(String[] str, ArrayList<String> list1, ArrayList<String> list2) {
		 for(String s : str) {
			 list1.add(s);
			 if(isPalindrome(s)) {
				 list2.add(s);
			 }
		 }
	}
	
	/*
	 * Check string contents only up to half the string length since other end is same
	 * Anytime a char is not the same as its string length subtracted by index, it is not a palindrome.
	 */
	private static boolean isPalindrome(String s)
	{
		int halfpoint = s.length()/2;

		for(int i = 0; i < halfpoint; i++) {
			if(s.charAt(i) != s.charAt(s.length() - 1- i))
					return false;
		}
		return true;
	}

}
