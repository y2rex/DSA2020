package week4.cycleLinkedList.loopdetection;

public class MainRunner2 {

	public static void main(String[] args) {
		
		
		LinkedList llist=new LinkedList();
		llist.push(10);
		llist.push(20);
		llist.push(30);
		llist.push(40);
		llist.push(50);
		llist.push(60);
		
//**********making loop***************
		llist.head.next=llist.head.next.next;
		
//********************O(n)**************8************************
		boolean res=llist.detectLoop();
		if(res)
			System.out.println("Loop found...");
		else
			System.out.println("Loop not found");
		
		llist.removeLoop();
		boolean r=llist.detectLoop();
		if(r)
			System.out.println("Loop found...");
		else
			System.out.println("Loop not found");
		
		System.out.println();

	}

}
