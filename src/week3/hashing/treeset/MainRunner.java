package week3.hashing.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class MainRunner {

	public static void main(String[] args) {

//======treeSet maintain insertion order=================
		TreeSet<String> ts1=new TreeSet<>();
		
		 // Elements are added using add() method 
        
        ts1.add("B"); 
        ts1.add("C"); 
        ts1.add("A"); 
  
        // Duplicates will not get insert 
        ts1.add("C"); 
  
        // Elements get stored in default natural 
        // Sorting Order(Ascending) 
        System.out.println("TreeSet: " + ts1); 

        // Checking if A is present or not
        System.out.println("\nTreeSet contains A or not:"
                           + ts1.contains("A"));

        // Removing items from TreeSet using remove()
        ts1.remove("A");

        // Printing the TreeSet
        System.out.println("\nTreeSet after removing A:" + ts1);

        // Iterating over TreeSet items
        System.out.println("\nIterating over TreeSet:");
        Iterator<String> i = ts1.iterator();
        while (i.hasNext())
            System.out.println(i.next());

	}

}
