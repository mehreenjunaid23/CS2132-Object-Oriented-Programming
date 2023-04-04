package lab2_1;
	class Circle
	{   double radius;
	     final double PI=3.14;     //making PI as final because its value is a constant. So, we cannot change its value after making it final
	     void perimeter(double r)
	     {
	         radius=r;    //assigning value to radius given by user
	         double perimeter= 2* radius* PI ;    //calculating perimeter of circle
	         System.out.println("Perimeter of circle is "+perimeter);   //printing perimeter of circle
	     }

	     void area(double r)
	     {
	         radius=r;    //assigning value to radius given by user
	         double area = radius * radius * PI;    //calculating area of circle
	         System.out.println("Area of circle is "+area);     //printing area of circle
	     }

	}