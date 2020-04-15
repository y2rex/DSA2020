package week6.binarytree.traversal.bft.spiraltraversal;

import java.util.ArrayList;
import java.util.Collections;

public class CircularSpiralTraversal2
{
	public static void main(String[] args) 
	{
		int arr[]=new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int n=arr.length;
		
		ArrayList<ArrayList<Integer>> al=new ArrayList<>();
		int startIndex=0;
		int l=(int)Math.sqrt(n);   //l=3
		
		for(int i=0;i<=l;i++)
		{
			int elements=0;
			al.add(new ArrayList<>());
			while(startIndex<n && elements<(int)Math.pow(2, i))
			{
				al.get(i).add(arr[startIndex++]);
				elements++;
			}	
		}	
		for(ArrayList<Integer> a : al)
			System.out.println(a);
		System.out.println("======================================");
		
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<=l/2;i++)
		{
			for(int t : al.get(i))
				sb.append(t+" ");
			
			for(int j=i+1;j<l;j++)
			{
			  int t=al.get(j).get(al.get(j).size()-1);
			  sb.append(t+" ");
			  al.get(j).remove(al.get(j).size()-1);
			}
			
			if(i!=l-i)
			{
				Collections.sort(al.get(l-i), Collections.reverseOrder()); 
				for(int t : al.get(l-i))
					sb.append(t+" ");	
			}
			
			for(int j=l-i-1;j>i;j--)
			{
				int t=al.get(j).get(0);
				sb.append(t+" ");
				al.get(j).remove(0);
			}
		}
		System.out.println(sb);
	}
}