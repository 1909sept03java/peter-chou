package q14;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Question14 {
	public static void main(String[] args) {
		switchCase(1);
		switchCase(2);
		switchCase(3);
	}
	
	/*
	 * Demonstrates switch case statements
	 * Case 1 gives square root of a number
	 * Case 2 gives current Date
	 * Case 3 puts a String into a list by split
	 */
	public static void switchCase(int n){
		switch(n) {
		case 1:
			double num = Math.random()*100;
			System.out.println(Math.sqrt(num));
			break;
		case 2:
			LocalDateTime d = LocalDateTime.now();
			System.out.println(d.toLocalDate());
			break;
		case 3:
			String s = "I am learning Core Java";
			ArrayList<String> l = new ArrayList<String>();
			String[] arraySplit = s.split(" ");
			
			for(String str : arraySplit)
			{
				l.add(str);
			}
			System.out.println(l.toString());
			break;
		}
	}
}
