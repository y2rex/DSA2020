package week5.stack.paranthesisbalance;

import java.util.Stack;

public class ParanthesisBalance {

	public static void main(String[] args) {
		
		String str="([{({}())1233}])";
		boolean res=isBalance(str);
		System.out.println(res);
	}

	private static boolean isBalance(String str) {

		Stack<Character> st=new Stack<>();
		
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			
			if(c=='['||c=='{'||c=='(')
				st.push(c);
			
			if(c==']' && st.pop()!='[')
				return false;
				
			if(c=='}' && st.pop()!='{')
				return false;
				
			if(c==')' && st.pop()!='(')
				return false;
		}
		if(st.empty())
			return true;
		else
			return false;
		
	}

}
