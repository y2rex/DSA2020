package week4.rotate;

public class LinkedList 
{

	Node head;
	LinkedList()
	{
		head=null;
	}
	public void addAtBegining(int x) {
		Node new_node=new Node(x);
		new_node.next=head;
		head=new_node;
	}
	public void display() {
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		
	}
	public void addAtLast(int x) {
		Node last=head;
		while(last.next!=null)
			last=last.next;
		last.next=new Node(x);
		
	}
	public void deleteBegining() {
		head=head.next;
	}
	public void deleteLast() {
		Node last=head;
		Node prev=null;
		
		while(last.next!=null){
			prev=last;
			last=last.next;
		}
		prev.next=null;	
	}
	public void length() {
		int k=0;
		Node last=head;
		while(last!=null){
			last=last.next;
			k++;
		}
		System.out.println(k);
	}
	public void reverse(int k) 
	{
		Node t=head;
		Node prev=null;
		while(k>0)
		{
			Node next=t.next;
			t.next=prev;
			prev=t;
			t=next;
			k--;
		}
		
		head.next=t;
		head=prev;
		
	}
	
}
