package week7.heap.problems.mergingksortedarray;

import java.util.Comparator;

public class ElementComparator implements Comparator<Element>
{

	@Override
	public int compare(Element a, Element b) 
	{
		return a.value-b.value;
	}
	
}
