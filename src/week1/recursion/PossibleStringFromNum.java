package week1.recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PossibleStringFromNum {

	public static void main(String[] args) 
	{
		
		String digit="234";
		List<String> res= print(digit);
		System.out.println(res);
	}

	private static List<String> print(String digit) 
	{
		List<String> result=new ArrayList<>();
	
		HashMap<Character, char[]> lettersMap=new HashMap<>();
		lettersMap.put('0', new char[]{});
		lettersMap.put('1', new char[]{});
		lettersMap.put('2', new char[]{'a','b','c'});
		lettersMap.put('3', new char[]{'d','e','f'});
		lettersMap.put('4', new char[]{'g','h','i'});
		lettersMap.put('5', new char[]{'j','k','l'});
		lettersMap.put('6', new char[]{'m','n','o'});
		lettersMap.put('7', new char[]{'p','q','r','s'});
		lettersMap.put('8', new char[]{'t','u','v'});
		lettersMap.put('9', new char[]{'w','y','z'});
		
		String str="";
		printUtil(digit,lettersMap,str,result);
		
		System.out.println(result);
		return result;
	}

	private static void printUtil(String digit, HashMap<Character, char[]> lettersMap, 
					String str,List<String> result) 
	{
		if(str.length()==digit.length())
		{
			result.add(str);
			return;
		}
		
		for(char ch : lettersMap.get(digit.charAt(str.length())))
		{
			str=str+ch;
			printUtil(digit, lettersMap, str, result);
			str=str.substring(0,str.length()-1);			//backtrack
		}	
	}
}