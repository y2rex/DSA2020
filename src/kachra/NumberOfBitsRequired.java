package kachra;
public class NumberOfBitsRequired {

	public static void main(String[] args) {
		bits(15);
		//System.out.println(a);
	}

	private static void bits(int num) {
		int res=0;
		int n=num;
		while(n>0){
			n=n/2;
			res++;
		}
		System.out.println(res);
		System.out.println("=======");
		if(res%2!=0){
		    num=num^(1<<(res/2));
		    System.out.println(num);	
		}
		else{
			num=num^(3<<((res/2)-1));
			System.out.println(num);
		}
		
	}

}
