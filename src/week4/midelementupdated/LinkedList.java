package week4.midelementupdated;

public class LinkedList 
{
	Node head;
	int data;
	public LinkedList() 
	{
		head=null;
	}
	public void add(int x) 
	{
		Node a=new Node(x);
		if(head==null)
			head=a;
		else
		{
			Node temp=head;
			while(temp.next!=null){
				temp=temp.next;
			}
			
			temp.next=a;
		}
		
	}
	public void show() {
		Node temp=head;
		
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		
	}
	public void showMid() 
	{
		Node slow=head;
		Node fast=head;
		
		while(fast.next!=null && fast.next.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		
		
		/*while(fast!=null&&fast.next!=null)
		{
			fast=fast.next.next;
			if(fast!=null)
				slow=slow.next;
		}
		
		if(fast==null)
			System.out.println(slow.data+" "+slow.next.data);
		else if(fast.next==null)*/
		
			System.out.println(slow.data);
	}
	public int length() 
	{
		int i=0;
				if(head==null)
					return i;
			else
			{
				Node temp=head;
				while(temp!=null)
				{
					i++;
					temp=temp.next;
				}
			}
		return i;
		
	}
}
