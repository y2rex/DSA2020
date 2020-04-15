package bufferreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class MainRunner {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader=
				new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Integer : ");
		String str=bufferedReader.readLine();
		System.out.println(str);
		
		
		BigInteger b=new BigInteger(str);
		System.out.println(b.divide(new BigInteger("7")));
		System.out.println(b.remainder(new BigInteger("7")).equals(new BigInteger("0")));
	}

}
