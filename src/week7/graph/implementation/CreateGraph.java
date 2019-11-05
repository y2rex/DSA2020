package week7.graph.implementation;

import java.util.ArrayList;

public class CreateGraph {

	int v;
	ArrayList<ArrayList<Integer>> adjL;
	
	public CreateGraph(int a) 
	{
		v=a;
//*******it creates vertices************************		
				adjL=new ArrayList<>(v); 
				
//*******it creates ArrayList for each vertices********					
				for(int i=0;i<v;i++)
					adjL.add(new ArrayList<Integer>());

//***********adding elements to 1st vertex*************		
				adjL.get(0).add(1);
				adjL.get(0).add(2);

//***********adding elements to 2nd vertex*************			
				adjL.get(1).add(0);
				adjL.get(1).add(2);
				adjL.get(1).add(3);

//***********adding elements to 3rd vertex*************			
				adjL.get(2).add(0);
				adjL.get(2).add(1);
				adjL.get(2).add(3);

//***********adding elements to 4th vertex*************			
				adjL.get(3).add(1);
				adjL.get(3).add(2);
				
	}

	public void show() {
		
		for(int i=0;i<adjL.size();i++)
		{
			ArrayList<Integer> al=adjL.get(i);
			        System.out.println("Connected vertices with "+i+" is/are :");
			
			for(int a : al)
				System.out.print(a+" ");
			
			System.out.println("\n============================================");
		}
		
	}
}
