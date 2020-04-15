package week4.cycleLinkedList.implementation;

class LinkedList
{
	Node head;
	LinkedList(){
		head=null;
	}
	public void push(int a) {
		Node new_node=new Node(a);
		if(head==null){
			head=new_node;
		}
		else{
			Node temp=head;
			while(temp.next!=null)
				temp=temp.next;
			temp.next=new_node;
			
		}
	}
	public void show() {
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		
	}
	
}