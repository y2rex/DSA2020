package week5.stack.implementation.usinglinkedlist;

public class StackImplementation {

	public static void main(String[] args) 
	{
		LinkedList llist=new LinkedList();
		llist.push(1);
		llist.push(2);
		llist.push(3);
		llist.push(4);
		llist.push(50);
		
		llist.show();
		System.out.println("=====================================");
		
		System.out.println(llist.size);
		System.out.println("=====================================");
		
		System.out.println(llist.pop());
		llist.show();
		System.out.println("=====================================");
		
		System.out.println(llist.peek());
		llist.show();
		System.out.println("=====================================");

	}

}
