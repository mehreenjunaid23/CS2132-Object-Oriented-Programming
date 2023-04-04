package lab3;

public class main {
		public static void main(String[] args) {
		rectangle myRectangle = new rectangle(4, 40);
		myRectangle.print();
		
		rectangle yourRectangle = new rectangle(3.5, 35.9);
		System.out.println("\n\nA rectangle with width " +
		yourRectangle.width + " and height " +
		yourRectangle.height + " has:\nArea = " +
		yourRectangle.getArea()+ "\nPerimeter = " +
		yourRectangle.getPerimeter());
		}
		
		}

		

