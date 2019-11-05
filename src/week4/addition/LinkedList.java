package week4.addition;

public class LinkedList 
{

	Node head;
	LinkedList(){
		head=null;
	}
	
	public void display() {
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		
	}
	public void addAtLast(int x) 
	{
		if(head==null)
			head=new Node(x);
		else
		{
			Node last=head;
			while(last.next!=null)
				last=last.next;
			last.next=new Node(x);
		}
		
		
	}
	
	
}
