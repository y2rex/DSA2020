package week5.stack.implementation.usingarray;

public class Stack
{
  int arr[];
  int top;
  int capacity;
  
  Stack(int a)
  {
	  capacity=a;
	  top=-1;
	  arr=new int[a];
  }

	public void push(int a) 
	{
	arr[++top]=a;	
	}
	

	public void show() {
		for(int a: arr)
			System.out.print(a+" ");
		
	}

	public int pop() {
    
		int res=arr[top];
		arr[top--]=0;
		return res;
		
	}

	public int peek() {
		
		return arr[top];
	}

	public int size() {
		
		return top+1;
	}

	public boolean isEmpty() {
		if(top==-1)
			return true;
		return false;
	}	
}
