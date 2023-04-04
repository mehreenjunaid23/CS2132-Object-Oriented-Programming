package lab5_3;
import java.util.Scanner;
public class MAIN {
		public static void main(String[] args) {
			// Create to char arrays
			char[] test = {'M', 'e', 'h', 'r', 'e', 'e', 'n'};
			char[] test2 = {'M', 'e', 'h', 'r', 'e', 'e', 'n','2'};

			// Create two MyString1 objects
			MyString1 str = new MyString1(test);
			MyString1 str2 = new MyString1(test2);

			// Display character at particular index of MyString1 object 1
			  Scanner s = new Scanner(System.in);
		      System.out.println("Enter the index number from 0 to 6 to view its character: ");
		      int num = s.nextInt();
		      System.out.println("- The character at index "+num+ " of MyString1 object 1: " 
				+ str.charAt(num));

			// Display the length of MyString1 object 1
			System.out.println("- Length of MyString1 object 1: " + str.length());


			// Display a Substring between 2 indexes of MyString1 object 1
			Scanner sc = new Scanner(System.in);
		    System.out.println("\nEnter the start and end index to get the substring: ");
		    int n1, n2;
		    n1 = sc.nextInt();
		    n2 = sc.nextInt();
			System.out.println("\nSubstring from index "+n1+" to "+n2+" of MyString1 object 1: ");
			MyString1 substr = str.substring(n1,n2);
			for (int i = 0; i < substr.length(); i++) {
				System.out.print(substr.charAt(i));		
			}
			System.out.println();

			// Display MyString1 object 1 as lowercase:"
			System.out.println("\nMyString1 object 1 to lowercase:");
			MyString1 lower = str.toLowerCase();
			for (int i = 0; i < lower.length(); i++) {
				System.out.print(lower.charAt(i));		
			}
			System.out.println();

			// Test if MyString1 object 1 is equal to MyString1 object 2
			System.out.println("\nIs MyString1 object 1 equal to MyString1 object 2? \n" 
				+ str.equals(str2));

			// Display the integer 145 as a MyString1 object
			Scanner scan = new Scanner(System.in);
		    System.out.println("\nEnter a number to display as a MyString1 object: ");
		    int n3= scan.nextInt();
			System.out.println("\nDisplaying the integer"+ n3+" as a MyString1 object: ");
			MyString1 value = str.valueOf(n3);
			for (int i = 0; i < value.length(); i++) {
				System.out.print(value.charAt(i));		
			}
			System.out.println();}}
