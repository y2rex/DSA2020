/*1st  solution: 
               we can solve it using 2 for loops==>>>O(n2)
2nd solution : 
              O(n)+2 traversal
 */
package week3.string;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		String str="geeksfogeeks";
	    find(str);

	}

	private static void find(String str) {
		int res=256;
		int count[]=new int[256];
		for(int i=0;i<str.length();i++)
			count[str.charAt(i)]++;
		
		
		for(int i=0;i<str.length();i++){
		    if(count[str.charAt(i)]==1)
		    {
		    	res=str.charAt(i);
		    	break;
		    }
		}
		System.out.println(res+"   "+(char)res);
	}

}
