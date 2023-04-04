package lab5_2;

import java.math.BigDecimal;
import java.util.Scanner;
import java.lang.Math.*;

public class pi {
	

	public static BigDecimal BBP_formula(int n){
		
	BigDecimal a = new BigDecimal(22);
	BigDecimal b = new BigDecimal(7);
	BigDecimal c = a.divide(b, n-1, BigDecimal.ROUND_UP);
	
	return c;}

	public static void main(String[] args) {
		
	System.out.print( "Please enter the number of PI digits you want: " );
	Scanner p = new Scanner(System.in);
	int num=p.nextInt();
	BigDecimal big_dec_1 =new BigDecimal(String.valueOf(BBP_formula(num)));
	System.out.println("\nThe value of PI is:\n"+big_dec_1);
	}}