package week5.stack.implementation.usingarray;

public class StackImplementation {

	public static void main(String[] args) 
	{
		Stack st=new Stack(5);
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		
		st.show();
		System.out.println("\n==============================");
		
		int a=st.pop();
		System.out.println(a);
		st.show();
		System.out.println("\n==============================");
		
		
		int b=st.peek();
		System.out.println(b);
		st.show();
		System.out.println("\n==============================");
		
		int length=st.size();
		System.out.println(length);
		System.out.println("==============================");
		
		boolean result=st.isEmpty();
		System.out.println(result);
		System.out.println("==============================");
		

	}

}
