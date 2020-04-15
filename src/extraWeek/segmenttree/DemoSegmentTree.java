package extraWeek.segmenttree;

public class DemoSegmentTree 
{
	static int []arr;
	static int []tree;
	public static void main(String[] args) 
	{
		arr=new int[]{1, 3, 5, 7, 9, 11}; 
		tree=new int[4*arr.length];
		
		makeTree(0,arr.length-1,0);
		
		for(int i=0;i<tree.length;i++)
			System.out.print(tree[i]+" ");
		System.out.println();
		
		int sum=getSum(1,3);
		System.out.println(sum);
		
		update(1,8); //set at index 1 is : 8 i.e; arr[1]=8
		
		System.out.println(getSum(1, 3));
	}

	private static void update(int index, int value) {
		int diff=value-arr[index];
		updateUtil(0,arr.length-1,index,diff,0);		// we always start updation from 0th index
		
	}

	//we are only updating segment tree not array
	private static void updateUtil(int s, int e, int index, int diff, int si) {
		if(index<s || index>e)
			return;
		tree[si]+=diff;
		if(s<e)
		{
			int mid=(s+e)/2;
			updateUtil(s, mid, index, diff, 2*si+1);
			updateUtil(mid+1, e, index, diff, 2*si+2);
		}
		
	}

	private static int getSum(int qs, int qe) {
		
		return getSumUtil(0,arr.length-1,qs,qe,0);
	}

	private static int getSumUtil(int s, int e, int qs, int qe, int si) {
		if(qs>e || qe<s)
			return 0;
		if(s>=qs && e<=qe)
			return tree[si];
		int mid=(s+e)/2;
		return getSumUtil(s, mid, qs, qe, 2*si+1)+getSumUtil(mid+1, e, qs, qe, 2*si+2);
	}

	private static int makeTree(int s, int e, int si) {
		if(s==e)
		{
			tree[si]=arr[s];
			return tree[si];
		}
		int mid=(s+e)/2;
		return tree[si]=makeTree(s, mid, 2*si+1)+makeTree(mid+1, e, 2*si+2);	
	}

	
}
