package q17;

import java.util.Scanner;

public class Question17 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter principal value: ");
		String arg1 = scanner.nextLine();
		
		System.out.print("Enter rate value:");
		String arg2 = scanner.nextLine();
		
		System.out.print("Enter number of years: ");
		String arg3 = scanner.nextLine();
		
		double result = calculateRate(Double.parseDouble(arg1),Double.parseDouble(arg2),Double.parseDouble(arg3));
		
		System.out.println("This is your interest: " + Double.toString(result));
		
	}
	
	public static double calculateRate(double principal, double rate, double years) {
		return principal * rate * years;
	}

}
