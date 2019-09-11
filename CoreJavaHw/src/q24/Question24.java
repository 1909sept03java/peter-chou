package q24;


public class Question24 {
	
	/*
	 * Use switch statements to determine if remainder is greater than or equal to 10
	 */
	public static String baseToHex(int n) {
		StringBuilder s = new StringBuilder();
		while(n != 0) {
			int remainder = n%16;
			switch(remainder) {
			case 10:
				s.insert(0,'A');
				break;
			case 11:
				s.insert(0,'B');
				break;
			case 12:
				s.insert(0,'C');
				break;
			case 13:
				s.insert(0,'D');
				break;
			case 14:
				s.insert(0,'E');
				break;
			case 15:
				s.insert(0,'F');
				break;
			default : 
				s.insert(0,remainder);
				break;
				
			}
			n = n/16;
		}
		return s.toString();
	}
}
