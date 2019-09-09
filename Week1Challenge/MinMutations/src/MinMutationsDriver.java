import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MinMutationsDriver {
	public static void main(String[] args) {
		String filepath = "src/io/Args";
		MinMutationsUtility u = new MinMutationsUtility();
		try {
			BufferedReader br = new BufferedReader(new FileReader(filepath));
			String[] startArg = br.readLine().split(":");
			String start = startArg[1].trim();
			
			String[] endArg = br.readLine().split(":");
			String end = endArg[1].trim();
			
			String[] bankArg = br.readLine().split(":");
			String[] bank = bankArg[1].trim().substring(1,bankArg[1].length()-1).split(",");
			
			int result= u.numMutations(start,end,bank);
			System.out.println(result);
			
			br.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
