package Q2;

//Q2. Write a program to display the first 25 Fibonacci numbers beginning at 0.

import java.util.ArrayList;

public class Question2 {
	
	public static ArrayList<Integer> fibonacci() {
		ArrayList<Integer> seq = new ArrayList<Integer>();
		seq.add(0);
		seq.add(1);
		int counter = 0;
		while(counter != 23) {
			int next = seq.get(counter) + seq.get(counter+1);
			seq.add(next);
			counter++;
		}
		return seq;
		
	}

}
