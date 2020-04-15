package week4.cycleLinkedList.implementation;

class MainRunner
 {
 	public static void main(String args[]){
		
 		
 		LinkedList llist=new LinkedList();
 		llist.push(20);
 		llist.push(4);
 		llist.push(15);
 		llist.push(10);
 		
//Last node has address of head,which make loop in LinkedList
 		llist.head.next.next.next.next=llist.head;
 		
 		llist.show();
	}
}