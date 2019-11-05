package week4.cycleLinkedList.loopdetection;

import java.util.HashSet;

public class LinkedList {
	Node head;
	public LinkedList() {
	head=null;	
	}
	public void push(int a) {
		Node new_node=new Node(a);
		if(head==null)
			head=new_node;
		else
		{
			Node temp=head;
			while(temp.next!=null)
				temp=temp.next;
			temp.next=new_node;
		}
	}
	public boolean detectLoopusingData() {

		/*
		 * pushing data into HashSet,
		 * Which is not good approach data may be repeated
		 * better option to push address of Node
		  */
		HashSet<Integer> hs=new HashSet<>();
		if(head==null)
			System.out.println("List is empty...");
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
					if(hs.contains(temp.data))
						return true;
				hs.add(temp.data);
				temp=temp.next;
			}
		}
		return false;
	}
	public boolean detectLoopusingAddress() {

		HashSet<Node> hs=new HashSet<>();
		Node temp=head;
		
		while(temp.next!=null){
			if(hs.contains(temp))
				return true;
			hs.add(temp);
			temp=temp.next;
		}
		return false;
	}
	public boolean detectLoop() {
		
		Node slow=head;
		Node fast=head;
		
		while(fast!=null&&fast.next!=null)
		{
			fast=fast.next.next;
			slow=slow.next;
			if(slow==fast)
				return true;
		}
		return false;
	}
	public void removeLoop() 
	{
		Node slow=head;
		Node fast=head;
		
		while(fast!=null && fast.next!=null)
		{
			fast=fast.next.next;
			slow=slow.next;
			
			if(slow==fast)
				break;
		}
		fast=head;
		int n=1;
		
		while(slow!=null && slow.next!=null)
		{
			if(slow==fast)
				break;
			fast=fast.next;
			slow=slow.next;
			n++;
		}
		System.out.println(n);
		
		while(n>0)
		{
			slow=slow.next;
			n--;
		}
		slow.next=null;
		
	}
	
}
