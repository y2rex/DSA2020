package week4.zpractice;

public class MainRunner2 
{
	public static void main(String[] args) {
		LL l=new LL();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(7);
		show(l.head);
		System.out.println("=====================");
		//showSwaped(l.head,1);
		System.out.println("======================");
		l.show(l.head,1);
		show(l.head);
	}

static Node headL;
	


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