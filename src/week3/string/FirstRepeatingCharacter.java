/*1st  solution: 
               we can solve it using 2 for loops==>>>O(n2)
2nd solution : 
              O(n)*/

package week3.string;

public class FirstRepeatingCharacter {

	public static void main(String[] args) {
		String str="zgeeksforgzaeeks";
		first(str);
	}

	private static void first(String str) {
		int count[]=new int[256];
		int res=256;
		    for(int i=0;i<256;i++)
			count[i]=-1;
		
		for(int i=0;i<str.length();i++){
			if(count[str.charAt(i)]==-1)
				count[str.charAt(i)]=i;
			else
				res=Math.min(res, count[str.charAt(i)]);
			/*control will come in this else loop only when character is repeated.
			  So.When control come in this loop then we focus on index value.i.e, i.
			                       if we take smallest value of 'i' then it we give the index of 
			  first repeating character.
			                    If we take largest value of 'i' then it will give
			  the index of last repeating character.                  
			*/
		}
	System.out.println(str.charAt(res));	
	}

}
