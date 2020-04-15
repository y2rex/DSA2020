package week1;

public class MainRunner2 {

	public static void main(String[] args) 
	{
		int n=13;

		System.out.println("1st possible value for XOR=SUM : "+firstValue(n));
		System.out.println("1st possible value for XOR=SUM : "+getFirstvalue(n));
		System.out.println("Total possible number : "+values(n));
		System.out.println("Total possible number : "+getValues(n));
	}
//efficient way to get possible values
/*	
	n*i==n^i;
	when 
	n&i=0
i.e;
find unset bits then possible values : 2^(unset_bits)	
	*/

	private static int getValues(int n) 
	{
		int unset_bits=0;
		while(n>0)
		{
			if((n&1)==0)
				unset_bits++;
			n=n>>1;
		}
		return (int) Math.pow(2,unset_bits);
	}
	
	private static int getFirstvalue(int n) 
	{
		int res=0;
		
		while(n>0)
		{
			res++;
			if((n&1)==0)
			break;
			n=n>>1;
		}
		return res;
	}
	
	

	private static int values(int n) {
		int res=0;
		int count=0;
		while(res<n)
		{
			if((res^n)==res+n)
				count++;
			res++;
		}
		
		return count;
	}

	private static int firstValue(int n) 
	{
		int res=1;
		
		while((n^res)!=(n+res))
			res++;
		
		System.out.println("XOR : "+(res^n)+" Sum : "+(res+n));
		
		return res;
	}

}
