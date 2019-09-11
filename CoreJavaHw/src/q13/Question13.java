package q13;

public class Question13 {
	public static void main(String[] args) {
		triangularBinary();
	}
	
	/*
	 * Prints binary (0 or 1) alternating in a triangular shape
	 * I made a switch variable to alternate between 0 and 1
	 * A counter called reps to keep track of number of characters per line starting at 0 and ending at 4
	 * Another counter called counter to make a triangle of height 4
	 * 
	 */
	
	public static void triangularBinary() {
		int counter = 0;
		int mySwitch = 0;
		int reps = 1;
		while(counter != 4)
		{
			for(int i = 0; i < reps ; i++) {
				System.out.print(mySwitch + " ");
				if(mySwitch == 0)
					mySwitch = 1;
				else
					mySwitch = 0;
			}
			reps++;
			counter++;
			System.out.print("\n\n");
			
		}
	}

}
