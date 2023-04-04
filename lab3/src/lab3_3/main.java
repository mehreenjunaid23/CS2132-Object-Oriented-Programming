package lab3_3;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class main {
		public static void main(String[] args) {
		book b1 = new book();
		  // Creating scanner object
        Scanner scanner = new Scanner(System.in);
        // Getting input from user
        System.out.print("Enter title of book: ");
        String title1 = scanner.next();
        System.out.print("Enter author of book: ");
        String author1 = scanner.next();
        System.out.print("Enter publication year of book: ");
        int year1 = scanner.nextInt();
        
        //assigning data to object
        b1.setTitle(title1);
        b1.setAuthor(author1);
        b1.setYear(year1);
		b1.print();
		
		//creating another object using constructor
		book b2 = new book("nice book","hamza",1980);
		b2.print();
		

		// Show outputs of method of first object using JOptionPane
        JOptionPane.showMessageDialog(null, "Title: " + b2.getTitle());
        JOptionPane.showMessageDialog(null, "Author: " + b2.getAuthor());
        JOptionPane.showMessageDialog(null, "publication year: " + b2.getYear());
				
		
		}
		
		}

