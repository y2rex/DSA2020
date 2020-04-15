package week4.NodeFromEnd;

public class MainRunner {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.addElement(10);
		ll.addElement(20);
		ll.addElement(30);
		ll.addElement(40);
		ll.addElement(50);
		
		ll.show();
		
		//ll.nthNodeFromLast(5);
		
	//	ll.nthNodeFromLastFast(5);
		System.out.println();
		ll.rotate(3);
		ll.show();

	}

}
