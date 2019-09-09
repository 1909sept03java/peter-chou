import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MinMutationsDriver {
	public static void main(String[] args) {
		System.out.println(System.getProperty("user.dir"));
		String filepath = "src/io/Args";
		MinMutationsUtility u = new MinMutationsUtility();
		try {
			BufferedReader br = new BufferedReader(new FileReader(filepath));
			String[] startArg = br.readLine().split(":");
			String start = startArg[1];
			
			String[] endArg = br.readLine().split(":");
			String end = endArg[1];
			
			String[] bankArg = br.readLine().split(":");
			String[] bank = bankArg[1].substring(1,bankArg[1].length()-1).split(",");
			
			System.out.println(bank.toString());
			System.out.println(u.numMutations(start,end,bank));
			
			br.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
