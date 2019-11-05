package week4.midelement;

public class MainRunner {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		//ll.add(50);
		
		ll.show();
		
		System.out.print("need two traversal :");
		ll.midElement();
		System.out.print("Need only one traversal :");
		ll.midElementFast();

	}

}
