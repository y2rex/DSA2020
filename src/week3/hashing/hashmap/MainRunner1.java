package week3.hashing.hashmap;

import java.util.HashMap;

public class MainRunner1 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<>();
		hm.put(1, "a");
		hm.put(2, "b");
		hm.put(3, "c");
		hm.put(4, "d");
		hm.put(5, "e");
		hm.put(6, "d");
		System.out.println(hm);
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println("====================================");
	    System.out.println("First element : "+hm.get(1));
	    System.out.println("Length of HashMap : "+hm.size());
	    boolean res=hm.containsValue("a");
	    boolean res1=hm.containsKey(10);
	    System.out.println(res+":::"+res1);

	}

}
