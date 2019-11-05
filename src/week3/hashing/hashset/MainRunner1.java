package week3.hashing.hashset;

import java.util.HashSet;

public class MainRunner1 {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<>();
		HashSet<String> hs1=new HashSet<>();
		
		//adding elements
		hs1.add("Akash");
		hs1.add("Kumar");
		hs.add("a");
		hs.add("b");
		System.out.println(hs);
		System.out.println("===============================");
//length
	    int l=hs.size();
	    System.out.println("length : "+l);
	    
//merging homogeneous collection hashset
	    System.out.println("====================");
	    hs.addAll(hs1);
	    for(String str : hs)
	    	System.out.println(str);
	    System.out.println("================================================");
	    System.out.println();
	    
	    
	    System.out.println("Total length : "+hs.size());
	    System.out.println("Length of 2nd HashSet : "+hs1.size());
	    
	    
//adding hetrogeneous data in hashset
	    System.out.println("==============================");
	    System.out.println();
	    
	    HashSet<Object> hs2=new HashSet<>();
	    hs2.add(1);
	    hs2.add("Akash");
	    hs2.add(2.2);
	    
	    for(Object obj :hs2)
	    	System.out.println(obj);
	    
	    
//removing elements from last	    
System.out.println("==================================================");	    
	    boolean res=hs.remove("b");
	     System.out.println(res);
	     for(String str : hs)
		    	System.out.println(str);
	     

//contains
	     System.out.println("=============================================");
	     boolean res1=hs.contains("a");
	     boolean res2=hs.containsAll(hs1);
	     System.out.println(res1+"::::"+res2);
	
	    // hs.retainAll(hs2);
	    // hs.clear();
	     
	     System.out.println("length of 1st hashset : "+hs.size());
	}
}
