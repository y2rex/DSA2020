package week3.string;

public class CheckRotationalWord {

	public static void main(String[] args) {
		String str1="abcd";
		String str2="cdab";	
		find(str1,str2);
	}

	private static void find(String str1, String str2) {
		str1=str1+str1;
		/*
		  logic :
			while doing str1+str1 sting become "abcdabcd".Now,If 
			str2 is rotational of str1 then definitely it will 
			available in str1.
				finally this problem become pattern search.
		*/
		int a=str1.indexOf(str2);
		if(a!=-1)
			System.out.println("found...");
		else
			System.out.println("not found...");
		
	}

}
