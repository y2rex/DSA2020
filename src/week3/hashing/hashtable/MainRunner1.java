package week3.hashing.hashtable;

import java.util.Hashtable;

public class MainRunner1 {

	public static void main(String[] args) {
		Hashtable<Integer, String> ht=new Hashtable<>();
		ht.put(1, "akash");
		ht.put(1, "kumar");
		System.out.println(ht);
		
		ht.put(2, "singh");
		System.out.println(ht);

	}

}
