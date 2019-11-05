package bufferreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class MainRunner2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader=
				new BufferedReader(new InputStreamReader(System.in));
		String str=bufferedReader.readLine();
		
		StringBuffer sb=new StringBuffer();
		
		int n=Integer.parseInt(bufferedReader.readLine());
	/*	357753
		3
		1 2
		2 3
		4 4*/
		for(int i=0;i<n;i++)
		{
			int x=Integer.parseInt(bufferedReader.readLine());
			int y=Integer.parseInt(bufferedReader.readLine());
			
			String temp=str.substring(x-1, y);
			System.out.println(temp);
			BigInteger b=new BigInteger(temp);
			
			if(b.remainder(new BigInteger("7")).equals(new BigInteger("0")))
				sb.append("YES");
			else
				sb.append("NO");
		}
		System.out.println(sb);
	}

}
