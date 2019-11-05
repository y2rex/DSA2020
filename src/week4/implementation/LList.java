package week4.implementation;

public class LList {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.addAtBegining(10);
		ll.addAtBegining(20);
		ll.addAtBegining(30);
		ll.addAtBegining(40);
		ll.addAtBegining(50);
		
		ll.addAtLast(60);
		ll.addAtLast(70);
		ll.addAtLast(80);
		
		ll.deleteBegining();
		ll.deleteLast();
		
		ll.length();
		
		ll.display();
	}

}
