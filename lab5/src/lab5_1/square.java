package lab5_1;

import java.math.BigInteger;

public class square{
	public static void main (String[] args){

		
		long a = (long)Math.sqrt(Long.MAX_VALUE);
		BigInteger x=BigInteger.valueOf(a);
		System.out.println("the square numbers are:\n");
		for(int i=1;i<=10;i++)
		{
		    BigInteger t=BigInteger.valueOf(1);
		    x=x.add(t);
		    t=x.multiply(x);
		    System.out.println(t);
		}
		
	}
}