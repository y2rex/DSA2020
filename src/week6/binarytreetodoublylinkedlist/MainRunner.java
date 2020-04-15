package week6.binarytreetodoublylinkedlist;


public class MainRunner {

	public static void main(String[] args) {
		
		Node root=new Node(15);	
		root.left=new Node(5);
		root.right=new Node(20);
		
		root.right.left=new Node(23);
		
		show(root);
		System.out.println("\n==============================");
		convertTreeToDLL(root);
		showDoublyLL(head);
	}
   private static void showDoublyLL(Node head) {
		
	   Node temp=head;
	   
	   while(temp!=null)
	   {
		   System.out.print(temp.data+" ");
		   temp=temp.right;
	   }
		
	}
   static Node head=null;
   static Node prev=null;
   
	private static void convertTreeToDLL(Node root) {
		
		if(root==null)
			return;
		convertTreeToDLL(root.left);
		if(head==null)
		{
			head=root;
			prev=root;
		}
		else
		{
			prev.right=root;
			root.left=prev;
			prev=prev.right;
		}
			convertTreeToDLL(root.right);
	}

	private static void show(Node root) {
	
		if(root==null)
			return;
		show(root.left);
		System.out.print(root.data+" ");
		show(root.right);
	}
}
