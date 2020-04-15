package week5.stack.implementation.twostack;

public class TwoStack 
{
	int top1;
	int top2;
	int length1=0;
	int length2=0;
	
	
	int arr[];
	
		TwoStack(int a)
		{
			arr=new int[a];
			top1=-1;
			top2=a;  //arr.length
		}

		public void push1(int i) 
		{
			if(top1+1<top2){
				arr[++top1]=i;
				length1++;
			}
			else
				System.out.println("Stack-1 overflow...");
			
		}

		public void push2(int i) 
		{
			if(top1+1<top2){
				arr[--top2]=i;
				length2++;
			}
			else
				System.out.println("Stack-2 overflow...");
		}

		public void show1() {
			int a=0;
			while(a<=top1)
				System.out.print(arr[a++]+" ");
			System.out.println();
			
		}

		public void show2() {
			int a=arr.length-1;
			while(a>=top2)
				System.out.print(arr[a--]+" ");
			System.out.println();
			
		}

		public int pop1() {
			length1--;
			return arr[top1--];
		}
		
		public int pop2() {
			length2--;
			return arr[top2++];
		}

		public int peek1() {
			
			return arr[top1];
		}
		
		public int peek2() {
			
			return arr[top2];
		}
}
