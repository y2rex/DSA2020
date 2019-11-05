package week4.mergelinkedlist.mergesort;

import week4.mergelinkedlist.LinkedList;
import week4.mergelinkedlist.Node;

public class MergeSortInSingleyLL {

	public static void main(String[] args) {
		
		LinkedList ll=new LinkedList();
		ll.push(2);
		ll.push(15); 
        ll.push(10); 
        ll.push(5); 
        ll.push(20); 
        ll.push(3); 
        ll.push(2);
        ll.show();
        
        mergeSort(ll.head);
        ll.show();

	}

	private static Node mergeSort(Node head) 
	{
		if(head==null || head.next==null)
			return head;
		
		Node mid=getMiddle(head);
		Node right=mid.next;
		Node left=head;
		mid.next=null;	//for left ll
		
		Node l=mergeSort(left);
		Node r=mergeSort(right);
		
		return merge(l,r);
	}

	private static Node getMiddle(Node head) 
	{
		if(head==null)
			return head;
		Node slow=head;
		Node fast=head;
		
		while(fast.next!=null && fast.next.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}

	private static Node merge(Node a, Node b) 
	{
		if(a==null)
			return b;
		if(b==null)
			return a;
		if(a.data<=b.data)
		{
			a.next=merge(a.next, b);
			return a;
		}
		else
		{
			b.next=merge(a, b.next);
			return b;
		}
	}

}
