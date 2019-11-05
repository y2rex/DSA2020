package week4.swapping;

public class LinkedList 
{
	Node head;
	LinkedList(){
		head=null;
	}
	public void push(int i) {

		Node new_node=new Node(i);
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
		
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		
	}
/*	public void firstTwo() {
		
		Node tem=head;
		head=head.next;
		tem.next=head.next;
		head.next=tem;
		
		
		
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		
	}*/
	public void consicutiveTwo(int a) {
    
	  Node curr=head;
	  Node prev=null;
	  
	  while(curr.data!=a)
	  {
		  prev=curr;
		  curr=curr.next;
	  }
	 
	  Node next=curr.next;
	  
	  prev.next=next;
	  curr.next=next.next;
	  
	  next.next=curr;//61 is set only for 66
	 
	  Node t=head;
	  while(t!=null){
		  System.out.print(t.data+" ");
		  t=t.next;
	  }
	  
	  
	  
		
	}
}
