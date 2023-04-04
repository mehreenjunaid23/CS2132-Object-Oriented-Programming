package lab3;

public class rectangle {
	public double width ;
	public double height;

	public rectangle(double w , double h){
	   width = w;
	   height = h;
	}
	public double getArea(){
	   return width * height;
	}
	public double getPerimeter(){
	   return 2 * (width + height);
	}
	public void print() {
		System.out.println("A rectangle with width = " + width+
				" and height = " + height+ " has:");
		System.out.println("Area = " + getArea());
		System.out.println("Perimeter = " + getPerimeter());
	}
	}