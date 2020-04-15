package week5.stack.implementation.twostack;

public class TwoStackUsingAnArray {

	public static void main(String[] args) 
	{
		TwoStack ts=new TwoStack(10);
		ts.push1(1);
		ts.push1(2);
		ts.push1(3);
		ts.push1(4);
		ts.push1(5);
		
		ts.push2(6);
		ts.push2(7);
		ts.push2(8);
		ts.push2(9);
		ts.push2(10);
		ts.push2(11);
		//ts.push2(12);
		
		ts.show1();
		ts.show2();
		
		System.out.println("=======================================");
		System.out.println(ts.pop1());
		System.out.println(ts.pop2());
		ts.show1();
		ts.show2();
		System.out.println("=======================================");
		
		System.out.println(ts.peek1());
		System.out.println(ts.peek2());
		ts.show1();
		ts.show2();
		System.out.println("=======================================");
		
		System.out.println("Length of 1st Stack : "+ts.length1);
		System.out.println("Length of 2nd Stack : "+ts.length2);
		System.out.println("=======================================");

	}

}
