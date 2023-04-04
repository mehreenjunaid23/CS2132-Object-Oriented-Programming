package lab6_1;


public class employee extends person
{
//An employee has an office, salary, and date hired.
String office;
double salary;
java.util.Date dateHired;
//Constructor with arguments
public employee(String name,String address,String phonenumber,String email,String off,double sal)
{
	super(name,address,phonenumber,email);
	office=off;
	salary=sal;
}
public String toString()
{
return (super.toString() + "\noffice: "+office +"\nsalary: "+salary);
}
}

