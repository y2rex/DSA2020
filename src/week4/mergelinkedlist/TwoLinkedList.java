package week4.mergelinkedlist;

public class TwoLinkedList 
{
	public static void main(String[] args) 
	{
		LinkedList a=new LinkedList();
		a.addNode(2);
		a.addNode(3);
		a.addNode(20);
		a.show();
		
		
		LinkedList b=new LinkedList();
		b.addNode(5);
		b.addNode(10);
		b.addNode(15);
		b.show();
		
		
		Node h=mergeSort(a.head,b.head);
		while(h!=null)
		{
			System.out.print(h.data+" ");
			h=h.next;
		}
	}

	private static Node mergeSort(Node h1, Node h2) 
	{
		if(h1==null)
			return h2;
		if(h2==null)
			return h1;
		if(h1.data<h2.data)
		{
			h1.next=mergeSort(h1.next, h2);
			return h1;
		}
		else
		{
			h2.next=mergeSort(h1, h2.next);
			return h2;
		}
		
		//return null;
	}
}
