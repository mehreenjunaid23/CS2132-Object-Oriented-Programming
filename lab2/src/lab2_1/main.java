package lab2_1;

import java.util.Scanner;

public class main {
	   public static void main(String[] args) {
	        Scanner sc =new Scanner(System.in);   // making sc as object of Scanner class for taking radius as input from user
	        System.out.print("Enter radius of circle = ");
	        double R=sc.nextDouble();
	        Circle obj = new Circle();  // making object of Circle class
	        obj.perimeter(R);
	        obj.area(R);

}}

