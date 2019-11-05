package week8.backtracking.permutationofstring;

//*********String which does not contain "AB" : 2nd Solution(Optimize)********************

public class PermutationOfString3 {

	static int count=0;
	public static void main(String[] args) {

		String str="ABC";
		permute(str,0,str.length()-1);	
		System.out.println("=========================");
		System.out.println(count);
	}
	
	private static boolean isSafe(String str, int l, int i, int r) {
		/*if(l!=0 && str.charAt(i-1)=='A' && str.charAt(i)=='B')
			return false;
		if(r==l+1 && str.charAt(i)=='A' && str.charAt(l)=='B')
			return false;*/
		
		if(l!=0 && str.charAt(l-1)=='A' && str.charAt(i)=='B')
			return false;
		if(r==l+1 &&str.charAt(i)=='A' && str.charAt(l)=='B')
			return false;
		
		return true;
	}

	private static void permute(String str, int l, int r) {
		
		if(l==r){
			System.out.println(str);
			count++;
		}
			
		else
		{
			for(int i=l;i<=r;i++)
			{
				if(isSafe(str,l,i,r))
				{
					str=swap(str,l,i);
					permute(str, l+1,r);
					str=swap(str,l,i);	
				}
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
