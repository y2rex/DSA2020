package week4.addition;

public class LList {

	public static void main(String[] args) 
	{
		LinkedList l1=new LinkedList();
		l1.addAtLast(5);
		l1.addAtLast(4);
		l1.addAtLast(9);
		l1.display();
		System.out.println();
		
		LinkedList l2=new LinkedList();
		l2.addAtLast(5);
		l2.addAtLast(9);
		
		l2.display();
		System.out.println("\n=================");
		
		add(l1,l2);
	}

	private static void add(LinkedList l1, LinkedList l2) 
	{
		LinkedList res=new LinkedList();
		int carry=0;
		
		Node h1=l1.head;
		Node h2=l2.head;
		
		while(h1!=null && h2!=null)
		{
			int n=carry+h1.data+h2.data;
			carry=n/10;
			
			res.addAtLast(n%10);
			h1=h1.next;
			h2=h2.next;
		}
		
			while(h1!=null)
			{
				int n=carry+h1.data;
				carry=n/10;
				res.addAtLast(n%10);
				h1=h1.next;
			}
			
			while(h2!=null)
			{
				int n=carry+h2.data;
				carry=n/10;
				res.addAtLast(n%10);
				h2=h2.next;
			}
		
		if(carry!=0)
			res.addAtLast(carry);
		
		
		res.display();
		
	}

}
