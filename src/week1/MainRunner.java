package week1;

import java.util.Scanner;

public class MainRunner {

	public static void main(String[] args) {
		
		System.out.println();
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		int n=sc.nextInt();
		int arr[]=new int[2*n];
		
		for(int i=0;i<2*n;i++)
		{
			arr[i]=sc.nextInt();
			arr[i+1]=sc.nextInt();
			i++;
			System.out.println();
		}
		
		System.out.println("Given Number : "+str);
		
		for(int a : arr)
			System.out.print(a+" ");
		System.out.println("\n=============================");
		for(int i=0;i<2*n;i++)
		{
			System.out.println(arr[i]+" "+arr[i+1]);
			i++;
		}
		/*357753
		3
		1 2
		2 3
		4 4
*/
		int i=0;
		while(2*n>i)
		{
			String temp=str.substring(arr[i]-1, arr[i+1]);
			
			if(Integer.parseInt(temp)%7==0)
				System.out.println(temp+"=>Yes");
			else
				System.out.println(temp+"=>No");
			i+=2;
		}
		sc.close();
		
	}

}
