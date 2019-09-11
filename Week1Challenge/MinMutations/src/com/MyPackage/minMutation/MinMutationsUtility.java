package com.MyPackage.minMutation;

public class MinMutationsUtility {
	
	public int numMutations(String start, String end, String[] bank) {
		if(start.equals(end))				//mutated string is same as start
			return 0;
		if(!searchGene(bank,end)) {			//check if mutated is valid
			return -1;
		}
		int counter = 0;
		StringBuilder state1 = new StringBuilder(start);
		boolean state = false;
		
		for(int i = 0; i < start.length();i++) {
			if(start.charAt(i) != end.charAt(i)) {
				counter++;																//# of mutations + 1
				StringBuilder state2 = new StringBuilder(state1);						//new string holder
				state2 = state2.replace(i, i+1, Character.toString(end.charAt(i)));		//mutate part of gene
				if(!searchGene(bank,state2.toString()))									//check if mutated gene doesn't exist in bank,
					state = false;
				else
				{
					state1 = state2;													//set mutated gene
					state = true;
				}
			}
		}
		if(state == false)
			return -1;
		return counter;
		
		
	}
	
	private boolean searchGene(String[] bank, String gene) {
		boolean status = false;
		for(int i = 0; i < bank.length;i++) {
			String current = bank[i];
			if(current.equals(gene))
					status =  true;
		}
		return status;
	}

}
