package week4.cycleLinkedList.beginingpointandlengthofloop;

public class MainRunner {

	public static void main(String[] args) {
		
		LinkedList llist=new LinkedList();
		llist.push(10);
		llist.push(20);
		llist.push(30);
		llist.push(40);
		llist.push(50);
		
//************making loop*************
		llist.head.next=llist.head;
		llist.loopLength();
	}

}
