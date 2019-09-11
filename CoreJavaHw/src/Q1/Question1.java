package Q1;
//Q1. Perform a bubble sort on the following integer array: 1,0,5,6,3,2,3,7,9,8,4

public class Question1 {
	
	public static int[] bubblesort(int[] arr) {
		boolean sorted = false;
		while(!sorted) 								//uses a state to check if array is sorted or not
		{
			for(int i = 0; i< arr.length-1;i++) 
			{
				if(arr[i]>arr[i+1])					//swap values in array if not in order
				{
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
				
			}
			if(checkSorted(arr))					//checks if state is valid
				sorted = true;
		}
		return arr;
	}
	
	private static boolean checkSorted(int[] arr) {
		for(int i = 0; i< arr.length-1;i++)
		{
			if(arr[i] > arr[i+1])
			{
				return false;
			}
		}
		return true;
	}
}
