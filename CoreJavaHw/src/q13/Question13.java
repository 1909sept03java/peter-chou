package q13;

public class Question13 {
	public static void main(String[] args) {
		triangularBinary();
	}
	
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
