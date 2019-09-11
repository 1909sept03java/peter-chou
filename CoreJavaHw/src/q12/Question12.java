package q12;

import java.util.ArrayList;

public class Question12 {
	
	/*
	 * Checks a list of numbers and gives only the even numbers
	 */
	public static ArrayList<Integer> evenNums(int start, int end) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		ArrayList<Integer> evens = new ArrayList<Integer>();
		
		for(int i = start; i <= end; i++) {
			nums.add(i);
		}
		
		for(int n : nums) {
			if(n%2 == 0)
			{
				System.out.print(n + ", ");
				evens.add(n);
			}
			
		}
		return evens;
		
	}
}
