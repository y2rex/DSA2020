package week4.zpractice;

public class LL 
{
	Node head;
	LL()
	{
		head=null;
	}
	public void add(int x) 
	{
		if(head==null)
			head=new Node(x);
		else
		{
			Node n=new Node(x);
			Node t=head;
			
			while(t.next!=null)
				t=t.next;
			t.next=n;
		}
		
	}
	public void show(Node head,int k) 
	{
		Node t=head;
		Node left=null;
		Node right=null;
		
		int temp=1;
		
		while(temp<k)
		{
			left=t;
			t=t.next;
			temp++;	
		}
			
		Node slow=head;
		
		while(t.next!=null)
		{
			right=slow;
			slow=slow.next;
			t=t.next;
		}
		System.out.println(left+":::"+right.data+":::"+t.data);
		if(left==null)
		{
			Node oldHead=head;
			right.next=head;
				
			this.head=t;
			head.next=oldHead.next;
			right.next.next=null;
		}
		else
		{
			Node x=left.next.next;
			Node y=right.next.next;
			
			Node a=left.next;
			Node b=right.next;
			
			left.next=b;
			b.next=x;
			right.next=a;
			a.next=y;	
		}
		
	}
}
