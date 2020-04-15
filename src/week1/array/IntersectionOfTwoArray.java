package week1.array;

public class IntersectionOfTwoArray {

	public static void main(String[] args) 
	{
		 	int arr1[] = {1, 2,3,3, 4, 5, 6}; 
	        int arr2[] = {2, 3,3, 5, 7}; 
	        int m = arr1.length; 
	        int n = arr2.length; 	
	        
	        intersect(arr1,arr2,m,n);

	}

	private static void intersect(int[] arr1, int[] arr2, int m, int n) 
	{
		int i=0,j=0;
		while(i<m && j<n)
		{
			if(arr1[i]<arr2[j])
				i++;
			
			else if(arr1[i]>arr2[j])
				j++;
			
			else
			{
				System.out.println(arr1[i]+" ");
				i++;
				//j++;
			}
		}
		
	}

}
