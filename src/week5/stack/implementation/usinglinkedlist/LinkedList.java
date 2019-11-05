package week5.stack.implementation.usinglinkedlist;

public class LinkedList {
	Node head;
	int size=0;
	LinkedList()
	{
		head=null;
	}
	public void push(int a) {
		Node new_node=new Node(a);
		if(head==null){
			head=new_node;
			size++;
		}
		else
		{
			Node temp=head;
			while(temp.next!=null)
				temp=temp.next;
			temp.next=new_node;
			size++;
		}
		
	}
	public void show() {
		if(head==null)
			System.out.println("Stack is empty...");
		else
		{
			Node temp=head;
			while(temp!=null){
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
		}
		System.out.println();
		
	}
	public int pop() {
		
		Node prev=null;
		Node temp=head;
			
		while(temp.next!=null){
			prev=temp;
			temp=temp.next;
		}
		prev.next=null;
		
		return temp.data;
	}
	public int peek() {
		Node temp=head;
		while(temp.next!=null)
			temp=temp.next;
		
		return temp.data;
	}

}
