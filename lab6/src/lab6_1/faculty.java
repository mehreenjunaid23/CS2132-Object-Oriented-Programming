package lab6_1;

public class faculty extends employee
{
//A faculty member has office hours and a rank.
String officeHours;
String rank;

//Constructor with arguments
public faculty(String name,String address,String phonenumber,String email,String off,int salary,String offHours,String ranks)
{
super(name,address,phonenumber,email,off,salary);
officeHours=offHours;
rank=ranks;

}
public String toString()
{
return (super.toString() + "\noffice hours: "+officeHours +"\nrank: "+rank);
}
}