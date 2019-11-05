package week7.heap.ArrayToHeap;

public class MainRunner 
{
	static int arr[]={15,10,3,2,8,7};
	public static void main(String[] args) 
	{
		buildHeap(arr);
		show(arr);
	}

	private static void buildHeap(int[] arr) {
	
	int lastNodeIndex=(arr.length-1-1)/2;
	
	for(int i=lastNodeIndex;i>=0;i--){
		heapify(i);
	    }
	}

	private static void heapify(int i) 
	{	
		while(i<arr.length && (2*i+2)<arr.length)
		{
			int root=arr[i];
			int left=arr[2*i+1];
			int right=arr[2*i+2];
			
			if(right<left && right<root)
			{
				int temp=root;
				arr[i]=right;
				arr[2*i+2]=temp;
				i=2*i+2;
			}
			
			else if(left<right && left<root)
			{
				int temp=root;
				arr[i]=left;
				arr[2*i+1]=temp;
				i=2*i+1;
			}
			else
				break;
			
		}
	}

	private static void show(int[] arr) {
		for(int a :arr)
			System.out.print(a+" ");
		
	}
}
