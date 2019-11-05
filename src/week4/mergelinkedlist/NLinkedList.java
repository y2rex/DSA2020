package week4.mergelinkedlist;

public class NLinkedList 
{
	public static void main(String[] args) 
	{
		int k=3;
		Node arr[]=new Node[k];  
	    
        arr[0] = new Node(1);                //1->3->5->7
        arr[0].next = new Node(3);  
        arr[0].next.next = new Node(5);  
        arr[0].next.next.next = new Node(7);  
    
        arr[1] = new Node(2);  				//2->4->6->8
        arr[1].next = new Node(4);  
        arr[1].next.next = new Node(6);  
        arr[1].next.next.next = new Node(8);  
    
        arr[2] = new Node(6);  				//0->9->10->11
        arr[2].next = new Node(9);  
        arr[2].next.next = new Node(10);  
        arr[2].next.next.next = new Node(11); 
        
        Node h=merge(arr,k-1);
        while(h!=null)
        {
        	System.out.print(h.data+" ");
        	h=h.next;
        }
	}

	private static Node merge(Node[] arr, int k) 
	{
		while(k!=0)
		{
			int start=0;
			int end=k;
			
			while(start<end)
			{
				arr[start]=mergeList(arr[start],arr[end]);
				start++;
				end--;
				k--;
			}
		}
		
		return arr[0];
	}

	private static Node mergeList(Node a, Node b) 
	{
		Node res=null;
		if(a==null)
			return b;
		if(b==null)
			return a;
		
		if(a.data<b.data)
		{
			a.next=mergeList(a.next, b);
			res=a;
		}
		else
		{
			b.next=mergeList(a, b.next);
			res=b;
		}
		
		return res;
	}

	
}
