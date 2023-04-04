package lab4_3;
import java.util.Scanner;

public class main {
	
	   public static void main(String[] args) {
	       //Declaring variables
	       int row,column;
	      
	       //scanner object
	       Scanner s=new Scanner(System.in);
	      
	       //Getting rows and column form user
	       System.out.print("Enter the number of rows and columns in the array :");
	       row=s.nextInt();
	       column=s.nextInt();
	  
			//Creating array
			double array[][]=new double[row][column];
			  
			//Getting the array elements entered by the user and populate them into an array
			System.out.println("Enter the array :");
			for(int i=0;i<row;i++)
			{
			   for(int j=0;j<column;j++)
			   {
			       array[i][j]=s.nextDouble();
			   }}
			
			//Calling the locateLargest method
			Location l=Location.locateLargest(array);
			  
			//Displaying the maximum element and its location
			System.out.println("\n\nThe Location of the largest element is: "+l.getMaxValue()+"\nIts Location is at: ("+l.getRow()+","+l.getColumn()+")");
			   }
	   }

