package week4.midelement;

public class LinkedList {
	Node head;
	public LinkedList() {
		head=null;
	}
	void add(int x){
		
		Node new_node=new Node(x);
		
		if(head==null)
			head=new_node;
		
		else{
			Node temp=head;
			while(temp.next!=null)
				temp=temp.next;
			temp.next=new_node;
			
		}
	}
	public void show() {
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	
	//need two traversal
	public void midElement() {
		
	int k=0,l=1;
	Node temp=head,res=head;
	while(temp!=null){
		temp=temp.next;
		k++;
	}
	
	
	if(k%2==0)
	{
		k=k/2;
		while(l<k){
			res=res.next;
			l++;
		}	
	}
	
	else
	{
		k=k/2+1;
		while(l<k){
			res=res.next;
			l++;
		}
	}
	System.out.println(res.data);
	}
	
	public void midElementFast() {
		Node slow=head,fast=head;
		while(fast!=null&&fast.next!=null)
		{	
			fast=fast.next.next;
	/*
	 * this if loop applied only to maintain 
	 * for even number of inputs
	 * */		
			if(fast!=null)
				slow=slow.next;
		}
		System.out.println(slow.data);
	}

	
}
