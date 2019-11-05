package week4.NodeFromEnd;

public class LinkedList {

	Node head;
	LinkedList()
	{
		head=null;
	}
	
	public void addElement(int x)
	{
		Node new_element=new Node(x);
		
		if(head==null)
			head=new_element;
		else
		{
			Node temp=head;
			while(temp.next!=null)
				temp=temp.next;
			
			temp.next=new_element;
		}
	}

	public void show(){
		Node temp=head;
		if(temp==null)
			System.out.println("your list is empty!");
		else
		{
			while(temp!=null){
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
		}
	}

	
	//=======need two traversal===========
	public void nthNodeFromLast(int x) 
	{
		Node curr=head;
		int length=0;
		
		if(curr==null)
		System.out.println("Empty  list");
		
		else
		{
			while(curr!=null)
			{
				curr=curr.next;
				length++;
			}
		
			length=length-x;
			int k=0;
			Node temp=head;
			while(k<length)
			{
				temp=temp.next;
				k++;
			}
			System.out.println();
		System.out.println(temp.data);
		
		
		}
		
	}

	
	//=======need only one traversal(same as window sliding approach)===========
	public void nthNodeFromLastFast(int x) {
		
		if(head==null)
			System.out.println("Empty list");
		else
		{
			Node start=head;
			Node end=head;
			
			//===making slide of length=x
			while(x>1)
			{
				end=end.next;	
				x--;
			}
			
			while(end.next!=null){
				start=start.next;
				end=end.next;
			}
			System.out.println(start.data);
		}
		
	}

	public void rotate(int k) 
	{
		Node t=head;
		Node oh=head;
		while(t.next!=null && k>1)
		{
			t=t.next;
			k--;
		}
		System.out.println(t.data +":::"+k);
		head=t.next;
		
		Node temp=head;
		while(temp.next!=null)
			temp=temp.next;
		temp.next=oh;
		t.next=null;
		
	}
}
