package Q5;

/*Write a substring method that accepts a string str and an integer idx and returns the
substring contained between 0 and idx-1 inclusive. Do NOT use any of the existing
substring methods in the String, StringBuilder, or StringBuffer APIs.
*/

public class Question5 {
	
	public static String substring(String str, int idx) {
		char[] arr = str.toCharArray();
		char[] answer = new char[arr.length];
		for(int i = 0; i < idx ; i++)
		{
			answer[i]=arr[i];
		}
		String s = new String(answer);
		return s.trim();
	}

}
