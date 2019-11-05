package week4.cycleLinkedList.loopdetection;

public class MainRunner {

	public static void main(String[] args) {
		
		
		LinkedList llist=new LinkedList();
		llist.push(10);
		llist.push(20);
		llist.push(30);
		llist.push(40);
		llist.push(50);
		llist.push(60);
		
//**********making loop***************
		llist.head.next=llist.head;
		
//********************O(n)+O(n)extra  space for hashing************************
		
		boolean res=llist.detectLoopusingData();
		if(res)
			System.out.println("Loop found....");
		else
			System.out.println("No loop found...");
	
//***************O(n)+O(n)extra space::::address is better approach,because it not going to repeated********
		boolean res1=llist.detectLoopusingAddress();
		if(res1)
			System.out.println("Loop found....");
		else
			System.out.println("No loop found...");
	}

}
