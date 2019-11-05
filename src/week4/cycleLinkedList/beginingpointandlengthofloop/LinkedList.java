package week4.cycleLinkedList.beginingpointandlengthofloop;

public class LinkedList {

	Node head;
	LinkedList(){
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
	public void loopLength() {
		int length=1;
		int index=1;
		
		if(head!=null)
		{
			Node slow=head;
			Node fast=head;
			
			while(slow.next!=null)
			{
				slow=slow.next;
				fast=fast.next.next;
				if(slow==fast)
					break;
				length++;
			}
			slow=head;
			while(slow!=fast)
			{
				index++;
				slow=slow.next;
				fast=fast.next;
			}
		}
		System.out.println("Length of loop : "+ length);
		System.out.println("Begining of loop is : "+index);
	}
}