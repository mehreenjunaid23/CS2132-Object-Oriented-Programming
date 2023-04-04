package lab4_2;
import java.util.GregorianCalendar;
public class Calendar {

	public static void main(String[] args) {
		GregorianCalendar d = new GregorianCalendar();
		
		System.out.println("The Current Year: " + d.get(GregorianCalendar.YEAR));
		System.out.println("The Current Month: " + (d.get(GregorianCalendar.MONTH)+1));
		System.out.println("The Current Day: " + d.get(GregorianCalendar.DAY_OF_MONTH));
		
		System.out.println();
		d.setTimeInMillis(1234567898765L);
		System.out.println("After setting time in millis:\n");
		System.out.println("The Year: " + d.get(GregorianCalendar.YEAR));
		System.out.println("The Month: " + (d.get(GregorianCalendar.MONTH)+1));
		System.out.println("The Day: " + d.get(GregorianCalendar.DAY_OF_MONTH));
		
		

	}

}

