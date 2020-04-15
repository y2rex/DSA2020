package week8.backtracking;

import java.util.*;
class PossibleStringPhoneNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
       
        
        System.out.println("Enter array length");
        
            int n = sc.nextInt(); // input size of array
            int arr[] = new int[n]; //input the elements of array that are keys to be pressed
            
            for(int i = 0; i < n; i++)
               arr[i] = sc.nextInt();
           possibleWords(arr, n);
            
            sc.close();
              
    }

  static  public void possibleWords(int a[], int N)
    {
        List<String> result=new ArrayList<>();
        
        
        HashMap<Integer,char[]> lettersMap=new HashMap<>();
        
            lettersMap.put(0,new char[]{});
            lettersMap.put(1,new char[]{});
            lettersMap.put(2,new char[]{'a','b','c'});
            lettersMap.put(3,new char[]{'d','e','f'});
            lettersMap.put(4,new char[]{'g','h','i'});
            lettersMap.put(5,new char[]{'j','k','l'});
            lettersMap.put(6,new char[]{'m','n','o'});
            lettersMap.put(7,new char[]{'p','q','r','s'});
            lettersMap.put(8,new char[]{'t','u','v'});
            lettersMap.put(9,new char[]{'w','x','y','z'});
            
            String str="";
            util(a, lettersMap, str, result);
            
            System.out.println(result);
    }
  public static void util(int a[],HashMap<Integer,char[]> lettersMap, String str,List<String> result )
  {
  	
  	if(str.length()==a.length)
  	{
  		result.add(str);
  		return;
  	}
  	
  	for(char ch: lettersMap.get(a[str.length()]))
  	{
  		str+=ch;
  		util(a, lettersMap, str, result);;
  		str=str.substring(0, str.length()-1);
  	}
  }
  
  
}