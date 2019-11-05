package week1.recursion;

import java.util.ArrayList;

public class PossibleSubset2 {

	public static void main(String[] args) {
		String str="ABC";
		ArrayList<String> res=new ArrayList<>();
		ArrayList<String>al=subset(str,0,"",res);
		System.out.println(al);
	}

	private static ArrayList<String> subset(String str, int i, 
			String st, ArrayList<String> res) {
		if(i==str.length()){
			 res.add(st);
			 return res;
		}
			subset(str, i+1, st, res);
			subset(str, i+1, st+str.charAt(i), res);
		
		return res;
	}

	
}