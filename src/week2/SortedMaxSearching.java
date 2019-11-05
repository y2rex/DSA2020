package week2;

public class SortedMaxSearching {
//=======search 35===================
	public static void main(String[] args) {
		int arr[][]={
				{10,20,30},
				{15,25,80},
				{35,90,100}
		};
		
		int x=35;
		search(arr,x);
	}

	private static void search(int[][] arr, int x) {
		int l=0;          //row
		int m=arr[0].length-1;//col
	
		while(l>=0&&m>=0)
		{
			if(arr[l][m]==x)
				break;
			else if(arr[l][m]>x)
				m--;
			else if(arr[l][m]<x)
				l++;
			else{
				l=-1;
				m=-1;
			}
		}
		System.out.println(l+","+m);
	}
}