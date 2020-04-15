package week3.string;

public class LastRepeatingCharacter {

	public static void main(String[] args) {
		String str="geeksforgeeks";
		last(str);

	}

	private static void last(String str) {
		int res=Integer.MIN_VALUE;
		int count[]=new int[256];
		
		for(int i=0;i<str.length();i++)
			count[i]=-1;
		
		for(int i=0;i<str.length();i++){
		if(count[str.charAt(i)]==-1)
			count[str.charAt(i)]=i;
		else
			res=Math.max(i, res);
		}
		System.out.println(str.charAt(res));
	}

}
