package q21;

public class Question21 {
	
	/*
	 * Removes repeating characters in a String
	 */
	public static String removeRepeatCharacters(String s) {
		StringBuilder str = new StringBuilder();
		
		/*
		 * When the current character is different from the next, 
		 * add it to the return string
		 */
		for(int i = 0;i<s.length()-1;i++) {
			if(s.charAt(i) != s.charAt(i+1)) {
				str.append(s.charAt(i));
			}
		}
		
		//Add last character of string since it is not checked 
		str.append(s.charAt(s.length()-1));
		
		return str.toString();
	}
}
