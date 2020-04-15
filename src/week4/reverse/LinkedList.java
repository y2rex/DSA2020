package week4.reverse;

public class LinkedList 
{

	Node head;
	LinkedList(){
		head=null;
	}
	public void addElement(int x) {	
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
	
	public void show() {
		Node crr_node=head;
		while(crr_node!=null){
			System.out.print(crr_node.data+" ");
			crr_node=crr_node.next;
		}
		
	}
	
	
/*	  ======Iterative Solution============= 
	 
	 public void reverse() {
		Node curr=head,prev = null;
		while(curr!=null){
			Node next=curr.next;
			curr.next=prev;
			
			prev=curr;
			curr=next;
		}
		head=prev;
	 }
	*/
	
	
	/*
	 ========recursive solution============
	 */
	public Node reverseRecursively(Node curr,Node prev) 
	{
		if(curr==null)
			return head;
		if(curr.next==null)
		{
			head=curr;
			curr.next=prev;
			return head;
		}
		Node next=curr.next;
		curr.next=prev;
		
	return	reverseRecursively(next,curr);
		
	}
}
