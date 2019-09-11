package q14;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Question14 {
	public static void main(String[] args) {
		switchCase(1);
		switchCase(2);
		switchCase(3);
	}
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
