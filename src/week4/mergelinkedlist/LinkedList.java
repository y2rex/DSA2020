package week4.mergelinkedlist;

public class LinkedList 
{
	public Node head;
	public LinkedList() 
	{
		head=null;
	}
	public void addNode(int x) 
	{
	if(head==null)
		head=new Node(x);
	else
	{
		Node t=head;
		while(t.next!=null)
			t=t.next;
		t.next=new Node(x);
	}
		
	}
	public void show() 
	{
		Node t=head;
		if(t==null)
			System.out.println("Empty LinkedList");
		else
		while(t!=null)
		{
			System.out.print(t.data+" ");
			t=t.next;
		}
		System.out.println();
	}
	public void push(int x) 
	{
		Node n=new Node(x);
		
			n.next=head;
			head=n;
	}
}
