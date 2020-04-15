package week7.heap.implementation;


public class Heap {
	int arr[];
	int size,cap;
	
	Heap(int c){
		arr=new int[c];
		cap=c;
		size=0;
	}


	public void show() {
		
		for(int a: arr)
			if(a!=0)
			System.out.print(a+" ");
		
	}

	
	public int getMin() {
		return arr[0];
	}


	public void heapify(int i)
	{
		 while(i<size)
		 {
			 int root=arr[i];
			 int left=arr[2*i+1];
			 int right=arr[2*i+2];
			 
			 if(left<right && left<root)
			 {
					 arr[i]=left;
					 arr[2*i+1]=root;
					i=2*i+1;		 
			 }
			 
			 else if(right<left && right<root)
			 {	 
					 arr[i]=right;
					 arr[2*i+2]=root;
					 i=2*i+2;
			 }
			 else
				 break;
		 }
	}
	
	
	public void extractMin() {
	
	//1. swap 1st & last element	
	 int temp=arr[0];
	 arr[0]=arr[size-1];
	 arr[size-1]=temp;
	 
	 //2. remove last element
	 arr[size-1]=0;
	 size--;
	 
	 //3. call heapify
	   heapify(0);
	 
	}

	public void insert(int x) {
		arr[size]=x;
		size++;
		
		if(size==cap)
		{
			int []arr1=new int[2*cap];
			int k=0;
			for(int a : arr)
				arr1[k++]=a;
			arr=arr1;
		}
		
		int i=size-1;
		/*while(i>0)
		{
			int pi=(i-1)/2;
			if(arr[pi]>arr[i])
			{
				int temp=arr[i];
				arr[i]=arr[pi];
				arr[pi]=temp;
			}
			i=pi;
		}*/
		while(i>0 && (arr[(i-1)/2]>arr[i]))
		{
				int temp=arr[i];
				arr[i]=arr[(i-1)/2];
				arr[(i-1)/2]=temp;
		
			i=(i-1)/2;
		}
	}


	public void decreaseKey(int i, int x) {
		arr[i]=x;
		
		while(i>0&& arr[(i-1)/2]>arr[i]){
			int temp=arr[i];
			arr[i]=arr[(i-1)/2];
			arr[(i-1)/2]=temp;
			
			i=(i-1)/2;
		}
	}


	public void delete(int i) {
		decreaseKey(i, Integer.MIN_VALUE);
		extractMin();
		
	}	
}
