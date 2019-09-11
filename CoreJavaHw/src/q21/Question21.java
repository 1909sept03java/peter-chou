package q21;

public class Question21 {
	public static String removeRepeatCharacters(String s) {
		//char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		StringBuilder str = new StringBuilder();
		
		for(int i = 0;i<s.length()-1;i++) {
			if(s.charAt(i) != s.charAt(i+1)) {
				str.append(s.charAt(i));
			}
		}
		str.append(s.charAt(s.length()-1));
		
		return str.toString();
	}
}
