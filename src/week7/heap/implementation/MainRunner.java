package week7.heap.implementation;

public class MainRunner {

	public static void main(String[] args) {
			
		Heap h=new Heap(7);
		System.out.println(h.cap);
		System.out.println(h.size);
		System.out.println("===========================");
		
		h.insert(10);
		h.insert(20);
		h.insert(30);
		h.insert(40);	
		h.insert(50);
		h.insert(60);
		h.insert(35);
		h.insert(90);	
	
		h.show();
		System.out.println("\n===========================");
		System.out.println("Get minimum element : "+h.getMin());
		System.out.println("===========================");
		
		h.extractMin();
		System.out.println(" After extraction : ");
		h.show();
		System.out.println("\n===========================");
		
		h.insert(32);
		System.out.println("After insertion of 32 : ");
		h.show();
		System.out.println("\n===========================");
		
		h.decreaseKey(3,15);
		System.out.println("Decreasing the 3rd element and make it 15 : ");
		h.show();
		System.out.println("\n===========================");
	
		h.delete(3);//we pass here index
		System.out.println("Deleting  3rd index element : ");
		h.show();
	}

}
