package Q3;
/*Reverse a string without using a temporary variable. Do NOT use reverse() in the
*StringBuffer or the StringBuilder APIs.
*/

public class Question3 {
	
	/*
	 * Created another char array and copy the contents of original
	 * string starting from back into the char array
	 */
	public static String reverse(String str) {
		char[] reverseArray = new char[str.length()];
		int counter = 0;
		
		for(int i = str.length()-1; i >= 0;i--) {
			reverseArray[counter] = str.charAt(i);
			counter++;
		}
		String reverse = new String(reverseArray);
		return reverse;
	}

}
