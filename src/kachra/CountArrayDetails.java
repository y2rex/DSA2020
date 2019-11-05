package kachra;

public class CountArrayDetails {

	public static void main(String[] args) {
		int count[]=new int[256];
		String str="geeksforgeeks";
		for(int i=0;i<str.length();i++)
			count[str.charAt(i)]++;
		
		for(int i=0;i<256;i++)
		{
		  if(count[i]!=0)	
			System.out.println((char) i+"->"+count[i]);
		}

	}

}
