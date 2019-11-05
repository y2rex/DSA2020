package week8.backtracking.permutationofstring;


//*******************all permutation********************************

public class PermutationOfString {

	public static void main(String[] args) {

		String str="ABC";
		permute(str,0,str.length()-1);	
	}

	private static void permute(String str, int l, int r) {
		
		if(l==r)
		{
			System.out.println(str);
		}
			
		else
		{
			for(int i=l;i<=r;i++)
			{
				str=swap(str,l,i);
				permute(str, l+1,r);
				str=swap(str,l,i);
			}
		}
	}

	private static String swap(String str, int l, int r) {
		
		char[] chars=str.toCharArray();
		
		char temp=chars[l];
		chars[l]=chars[r];
		chars[r]=temp;
		
		return String.valueOf(chars);
	}
}