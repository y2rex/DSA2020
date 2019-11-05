package week4.zpractice;

public class MainRunner 
{
	public static void main(String[] args) {
		LL l=new LL();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		//l.add(6);
		
		show(l.head);
		showAlt(l.head);
		show(l.head);
	}

	private static void showAlt(Node head) 
	{
		Node prev=null;
		Node curr=head;
		int count=1;
		
		while(curr!=null)
		{
			if(count%2==0)
				prev.next=curr.next;
			else
				prev=curr;
			
			curr=curr.next;
			count++;
		}
		
	}

	private static void show(Node head) {
		Node t=head;
		while(t!=null)
		{
			System.out.print(t.data+" ");
			t=t.next;
		}
		System.out.println();
	}
}
