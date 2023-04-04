package lab4_1;

import java.util.*;

public class Int {
	 public static void main(String[] args)
	    {
	        // create random object
	        Random r = new Random(1000);

	        // generating integers
	        int num;
	        System.out.println("\nThe 50 integers randomly generated are :\n");
	        for(int i = 0; i < 50; i++)
	       {
	           num = r.nextInt(100);
	           // Printing the random Number
	           System.out.print(num+" ");
	       }
	       System.out.println("\n");
	   }
}
