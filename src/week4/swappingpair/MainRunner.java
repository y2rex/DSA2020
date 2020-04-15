package week4.swappingpair;

public class MainRunner {

	public static void main(String[] args) {

     LinkedList  llist=new LinkedList();
     llist.push(10);
     llist.push(20);
     llist.push(30);
     llist.push(40);
     llist.push(50);
     llist.push(60);
     llist.push(70);
     
     llist.show();
     System.out.println();
     
     llist.pairSwap();
     llist.show();
     

	}

}
