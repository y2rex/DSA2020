package week7.graph.dijkstras;

import java.util.Comparator;

class Node implements Comparator<Node> { 
	    public int node; 
	    public int cost; 
	  
	    public Node() 
	    { 
	    } 
	  
	    public Node(int node, int cost) 
	    { 
	        this.node = node; 
	        this.cost = cost; 
	    } 
	  
	    @Override
	    public int compare(Node node1, Node node2) 
	    { 
	    	int res=node1.cost-node2.cost;
	  //If you want to shortest path  then return only "res" but if you want largest path then return "-res"	
	    	
	        return res; 
	    } 
	    
	  /*  
	    @Override
	    public int compare(Node node1, Node node2) 
	    { 
	    	int res=node1.node-node2.node;	   //it will remove that node whose node is smallest in queue
	    	
	        return res; 
	    } */
	    
	    
	} 
