package week4.reverse;

public class Reverse {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.addElement(10);
		ll.addElement(20);
		ll.addElement(30);
		ll.addElement(40);
		ll.addElement(50);
		ll.show();
		System.out.println();
		
		/*ll.reverse();
		ll.show();*/
		
		ll.reverseRecursively(ll.head,null);
		ll.show();
		

	}

}
