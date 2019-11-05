package week4.swappingpair;

public class LinkedList {
	Node head;
	LinkedList()
	{
		head=null;
	}
	public void push(int a) {

		Node new_node=new Node(a);
		
		if(head==null)
			head=new_node;
		else
		{
			Node temp=head;
			
			while(temp.next!=null)
				temp=temp.next;
			temp.next=new_node;
		}
		
	}
	public void show() {
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public void pairSwap() {


		Node prev=null;
		Node curr=head;
		Node newHead=head.next;
		
		while(curr!=null&&curr.next!=null)
		{
			Node next=curr.next;
			curr.next=next.next;
			next.next=curr;
			if(prev!=null)
			  prev.next=next;
			prev=curr;
			
		curr=curr.next;
		}
		head=newHead;	
	}
}
