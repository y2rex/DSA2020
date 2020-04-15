package week3.string;

public class Anagram {

	public static void main(String[] args) {
		String str1="ggf";
		String str2="gfg";
		boolean res=search(str1,str2);
		System.out.println(res);
	}

	private static boolean search(String str1, String str2) {
		
				int []count1=new int[256];
				for(int i=0;i<str1.length();i++){
					count1[str1.charAt(i)]++;
				}
				
				for(int i=0;i<str2.length();i++){
					count1[str2.charAt(i)]--;
				}
				
				for(int i :count1)
					if(i!=0)
						return false;
					
				return true;

	}

}
