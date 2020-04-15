package week7.heap.problems.mergingksortedarray;

import java.util.PriorityQueue;

public class MergingKSortedArray {

	public static void main(String[] args) {
		
		int mat[][]=new int [][]
				{
					{5,10},
					{2,3,15},
					{1,25,30,40}
				};
		sort(mat);		
	}

	private static void sort(int[][] mat) 
	{
		PriorityQueue<Element> pq=new PriorityQueue<>(new ElementComparator());
		
		for(int i=0;i<mat.length;i++)
			pq.add(new Element(mat[i][0], i,0));
	
		while(!pq.isEmpty())
		{
			Element e=pq.remove();
			System.out.print(e.value+" ");
			
			int row=e.row;
			int col=e.col;
			
			if(col<mat[row].length-1)
			{
				Element el=new Element(mat[row][col+1], row, col+1);
				pq.add(el);
			}
		}
	}
}